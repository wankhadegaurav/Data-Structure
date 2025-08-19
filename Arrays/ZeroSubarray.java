public class ZeroSubarray 
{
    public static void main(String args[])
    {
        int nums[]={0,0,0,2,0,0};
        System.out.println(numberOfZeroSubArray(nums));
    }
    public static int numberOfZeroSubArray(int nums[])
    {
        int count=0;
        int steak=0;
        for(int i:nums)
        {
            if(i==0){
                steak++;
                count+=steak;
            }
            else{
                steak=0;
            }

        }
        return count;

    }
    
}
