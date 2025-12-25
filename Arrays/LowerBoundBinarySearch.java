public class LowerBoundBinarySearch 
{
    public static void main(String args[])
    {
    int arr[]={3,5,8,15,19};
    int target=9;   
    System.out.println(lowerBoundSearch(arr, target));     

    }
    public static int lowerBoundSearch(int arr[],int target)
    {
        int ans=arr.length-1;
        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            
           if(arr[mid]>=target){
             ans=mid;
             high=mid-1;
           }
           else {
            low=mid+1;
           }
        }
        return ans;
    }
    
}
