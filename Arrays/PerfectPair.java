public class PerfectPair
{
    public static void main(String[] args) 
    {
        int arr[]={1,10,100,1000};
        System.out.println(perfectPairs(arr));
        
    }
     public static long perfectPairs(int[] nums) 
    {
        long count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            {
                int min=Math.min(Math.abs(nums[i]-nums[j]),Math.abs(nums[i]+nums[j]));
                int max=Math.max(Math.abs(nums[i]-nums[j]),Math.abs(nums[i]+nums[j]));
                if(min<=Math.min(Math.abs(nums[i]),Math.abs(nums[j]))&&max>=Math.max(Math.abs(nums[i]),Math.abs(nums[j]))){
                 count++;   
                }
            }
        }
        return count;
        
    }
    
}