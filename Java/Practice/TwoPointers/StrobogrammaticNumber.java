// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String s="198861";
        int i=0, j=s.length()-1;
        int flag=1;
        while(i<j)
        {
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            switch(c1)
            {
                case '1':
                if(c2!='1')
                {
                    flag = 0;
                    break;
                }
                break;
                case '9':
                    if(c2!='6')
                    {
                        flag=0;
                        break;
                    }
                    break;
                case '6':
                    if(c2!='9')
                    {
                        flag=0;
                        break;
                    }
                    break;
                case '8':
                    if(c2!='8')
                    {
                        flag=0;
                        break;
                    }
                    break;
                case '0':
                    if(c2!='0')
                    {
                        flag=0;
                        break;
                    }
                break;
                default:
                flag=0;
            }
            i++;
            j--;
        }
        if(flag==1)
        System.out.println("Strobogrammatic number");
        else
        System.out.println("Not a Strobogrammatic number");
    }
}
