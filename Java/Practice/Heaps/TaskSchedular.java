class Task
{
    int freq;
    int time;
    Task(int f, int t)
    {
        this.freq=f;
        this.time=t;
    }
}
class Solution {
    public int leastInterval(char[] tasks, int n)
    {
        int times=0;
        PriorityQueue<Task> maxHeap=new PriorityQueue<>((a,b)->b.freq-a.freq);
        Queue<Task> q=new LinkedList<>();
        int[] count=new int[26];
        for(char t:tasks)
        {
            count[t-'A']++;
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]>0)
            maxHeap.add(new Task(count[i],1));
        }
        while(!maxHeap.isEmpty() || !q.isEmpty())
        {
            times++;
            while(!q.isEmpty() && q.peek().time==times)
            {
                maxHeap.add(q.poll());
            }
            if(!maxHeap.isEmpty())
            {
                Task taskToExecute=maxHeap.poll();
                taskToExecute.freq-=1;
                taskToExecute.time=times+n+1;
                if(taskToExecute.freq>0)
                    q.add(taskToExecute);
            }

        }
        return times;
    }
}
