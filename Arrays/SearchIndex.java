public class SearchIndex 
{
    public static void main(String args[])
    {
        int arr[]={1,2,4,7};
        int target=6;
        System.out.println(searchIndexPosition(arr, target));


    }
    public static int searchIndexPosition(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
           if(arr[mid]>target){
             ans=mid;
             high=mid-1;
           }
           else if(arr[mid]==target) return mid;
           else{
            low=mid+1;
           }
        }
        return ans;
    }
    
}
