// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void sortTwoColors(int[] arr)
    {
        int i=0, j=arr.length-1;
        while(i<=j)
        {
            if(arr[i]==1)
            {
                int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            }
            else
            i++;
        }
    }
    public static void main(String[] args) {
         int[] arr={1,1,0,0,1,0,1,0,0};
        System.out.println("Before : ");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        
        sortTwoColors(arr);
        
        System.out.println();
        System.out.println("After : ");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
