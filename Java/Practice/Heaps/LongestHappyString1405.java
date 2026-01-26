class CharacterCount
{
    int count;
    char c;
    CharacterCount(int count1, char ch)
    {
        count=count1;
        c=ch;
    }
}
class Solution {
    public String longestDiverseString(int a, int b, int c)
    {
        PriorityQueue<CharacterCount> maxHeap=new PriorityQueue<>((x,y)->y.count-x.count);

        if(a>0)
        maxHeap.add(new CharacterCount(a,'a'));

        if(b>0)
        maxHeap.add(new CharacterCount(b,'b'));

        if(c>0)
        maxHeap.add(new CharacterCount(c,'c'));

        StringBuilder res=new StringBuilder();

        while(!maxHeap.isEmpty())
        {
            CharacterCount maxEle=maxHeap.poll();
            if(res.length()>1 && res.charAt(res.length()-1)==maxEle.c && res.charAt(res.length()-2)==maxEle.c)
            {
                if(maxHeap.isEmpty())
                return res.toString();

                CharacterCount secondMax=maxHeap.poll();
                int sCount=secondMax.count;
                char sC=secondMax.c;

                res.append(sC);
                sCount=sCount-1;

                if(sCount>0)
                maxHeap.add(new CharacterCount(sCount,sC));
            }
            else
            {
                res.append(maxEle.c);
                maxEle.count-=1;
            }
            if(maxEle.count>0)
            maxHeap.add(new CharacterCount(maxEle.count,maxEle.c));
        }
        return res.toString();
    }
}
