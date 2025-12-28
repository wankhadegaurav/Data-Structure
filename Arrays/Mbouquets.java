import java.util.Arrays;

public class Mbouquets
{
    public static void main(String args[])
    {
        int nums[]={1,10,3,10,2};
        int m=3;
        int k=2;
        System.out.println("Minimum Number of Days for Mbouquets :"+minimunNumberMbouquest(nums, m, k));
    }

    // Tc (n Log n )
    public static boolean possiable(int nums[],int day,int m, int k)
    {
        int count=0;
        int bouquets=0;
        for(int i=0;i<nums.length;i++){
            if(day>=nums[i])
            {
                count++;
            }
            else{
                bouquets+=Math.floorDiv(count,k);
                count=0;
            }
        }
        bouquets+=Math.floorDiv(count, k);
        if(bouquets>=m)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static int minimunNumberMbouquest(int nums[],int k,int m)
    {
       int min=Arrays.stream(nums).min().getAsInt();
       int max=Arrays.stream(nums).max().getAsInt();
       int low=min;
       int high=max;
       int ans=0;
       if(nums.length<=k*m) return -1;
       while(low<=high)
      {
           int mid=(low+high)/2;
           if(possiable(nums, mid, m, k))
            {
               ans=mid;
               high=mid-1;
           }
           else{
               low=mid+1;
           }
       }
       return ans;

    }

}