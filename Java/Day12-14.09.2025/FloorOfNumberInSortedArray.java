class Main {
    public static void main(String[] args) 
    {
        int[] arr={5,9,15,20};
        System.out.println(floorOfNumber(arr,10));
    }
    
    static int floorOfNumber(int[] arr, int k)
    {
        int start=0, end=arr.length-1, mid=0;
        while(start<end)
        {
            mid=start + (end-start)/2;
            if(arr[mid]==k)
            return mid;
            else if(k>arr[mid])
            start=mid+1;
            else
            end=mid-1;
        }
        return end;
    }
}
