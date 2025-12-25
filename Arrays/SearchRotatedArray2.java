public class SearchRotatedArray2 
{
    public static void main(String args[])
    {
       int arr[]={1,0,1,1,1};
       int target=0;
       System.out.println("SearchRotatedArray :"+searchRotatedArray(arr, target));

    }
    public static boolean searchRotatedArray(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return true;

            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }

            if(arr[low]<arr[mid] && low<high)
            {
                if(arr[low]<=target && target<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }

            }
            else
            {
                if(arr[mid]<target && target <=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }

            }
           
        }
        return false;
        
    }
    
}
