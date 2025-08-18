public class SplitArray 
{
    public static void main(String args[])
    {
        int nums[]={2,3,1,0};
        System.out.println(splitArray(nums));
    }
    public static int splitArray(int nums[])
    {
        int totalsum=0;
        for(int i=0;i<nums.length;i++)
        {
                totalsum+=nums[i];
        }
        int left=0;
        int leftsum=0;
        int count=0;
        while(left<nums.length)
        {
            int remaining=totalsum-(leftsum+nums[left]);
            leftsum+=nums[left];
            if(leftsum>=remaining&&left<nums.length-1){
                count++;
            }
            left++;
        }
        return count;

    }
    
}
