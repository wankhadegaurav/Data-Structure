import java.util.Arrays;

public class KokoEating 
{
    public static void main(String args[])
    {
        int nums[]={3, 6, 7, 11};
        int hours=8;
        int  max=Arrays.stream(nums)
        .max()
        .getAsInt();
        System.out.println(max);
        System.out.println("koko banana Eating Challenge :"+binarySearch(nums, hours));
    }
    public static int max(int nums[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
    
    public static int totalTime(int nums[],int speed)
    {
        int totalTime=0;
        for(int i=0;i<nums.length;i++)
        {
            totalTime+=(int)Math.ceil((double)nums[i]/speed);
        }
        return totalTime;
    }

    public static int binarySearch(int nums[],int hour)
    {
        int low=1;
        int  high=max(nums);
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(totalTime(nums, mid)<=hour)
            {
                ans=mid;
                high=high-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    
}
