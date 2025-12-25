public class UpperBounedBinarySearch 
{
    public static void main(String args[])
    {
        int arr[]={1,2,2,3};
        int target=2;
        System.out.println(upperBoundBinary(arr, target));
    }
    public static int upperBoundBinary(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        int answer=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>target)
            {
                answer=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return answer;
    }

    
}
