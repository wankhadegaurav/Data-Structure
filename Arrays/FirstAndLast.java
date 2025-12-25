import java.util.Arrays;

public class FirstAndLast
{
    public static void main(String args[])
    {
        int arr[]={5,7,7,8,8,10};
        int target=8;
        int nums[]=new int[2];
        nums[0]=startIndex(arr, target);
        nums[1]=lastIndex(arr, target);

        Arrays.stream(nums)
        .forEach((x)->System.out.println(x));
    }
    public static int startIndex(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        int start=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
           if(arr[mid]==target){
            start=mid;
            high=mid-1;
           }
           else if(arr[mid]<target) low=mid+1;
           else high=mid-1;
        }
        return start;
    }

    public static int lastIndex(int arr[],int target)
    {
        int low=0;
        int  high=arr.length-1;
        int end=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target){
                end=mid;
                low=mid+1;
            }
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return end;
    }
    
}
