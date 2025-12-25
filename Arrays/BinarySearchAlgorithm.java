public class BinarySearchAlgorithm
{
    public static void main(String args[])
    {
        int arr[]={2,3,4,5,6,7,8,9};
        int target=8;
        // System.out.println(binearySearch(arr, target));
        System.out.println(binearySearch(arr, 0, arr.length-1, target));

    }
    // public static int binearySearch(int arr[],int target)
    // {
    //     int low=0;
    //     int high=arr.length-1;
    //     while(low<=high)
    //     {
    //         int mid=(low+high)/2;
    //         if(arr[mid]==target) return mid;
    //         else if(target>arr[mid]) low=mid+1;
    //         else high=mid-1;
    //     }
    //     return -1;

    // }
    public static int binearySearch(int arr[],int low ,int high,int target)
    {
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]==target) return mid;
        else if(target>arr[mid]) return binearySearch(arr, mid+1, high, target);
        else return binearySearch(arr, low, mid+1, target);
        
    }
    
}