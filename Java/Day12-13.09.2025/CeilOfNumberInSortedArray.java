// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,6,8,9,15};
        System.out.println(ceil(arr,10));
    }
    
    static int ceil(int[] arr, int target)
    {
        int start=0, end=arr.length-1, mid=0;
        if(target>arr[end])
        return -1;
        while(start<=end)
        {
            mid=start+ (end-start)/2;
            if(target>arr[mid])
            start=mid+1;
            else if(target<arr[mid])
            end=mid-1;
            else
            return arr[mid];
        }
        return arr[start];
    }
}
