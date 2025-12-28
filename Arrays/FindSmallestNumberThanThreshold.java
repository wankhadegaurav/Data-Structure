import java.util.Arrays;

public class FindSmallestNumberThanThreshold 
{
    public static void main(String args[])
    {
        int nums[]={21212,10101,12121};
        int threshold=1000000;
        System.out.println("Find Smallest Number Then Threshold :"+small(nums, threshold));
    }
    // optimal approach 
 public static int small(int nums[],int threshold)
    {
        int max=Arrays.stream(nums).max().getAsInt();
        int divisor=1;
        int low=1;
        int high=max;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(result(nums,threshold,mid)<threshold)
            {
                divisor=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return divisor;
    }
    public static int result(int nums[],int threshold,int divisor)
    {
        long sum=0;
         for(int i=0;i<nums.length;i++)
         {
            sum+=(int)Math.ceilDiv(nums[i],divisor);
            if(sum>threshold){
                return Integer.MAX_VALUE;
            }
         }
         if(sum<=threshold)
         {
            return -1;
         }
         else{
            return Integer.MAX_VALUE;
         }
    }

  
 
}
