public class Pivotindex 
{
    public static void main(String args[])
    {
        int nums[]={2,1,-1};
        System.out.println(Pivotindex(nums));
    }
    public static int  Pivotindex(int nums[])
    {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }

        int left=0;
        int leftsum=0;
        while(left<nums.length)
        {
            int remainging=totalsum-(leftsum+nums[left]);
            if(remainging==leftsum){
                return left;
            }
            leftsum+=nums[left];
            left++;

        }
        return -1;
    }

}