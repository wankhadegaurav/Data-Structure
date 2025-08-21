public class JumpStep{
    public static void main(String args[])
    {
       
        int nums[]={3,0,8,2,0,0,1};
        System.out.println(farest(nums));
       
    }
    public static boolean farest(int nums[])
    {
        int farest=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>farest) return false;
            farest=Math.max(farest,i+nums[i]);
            if(farest>=nums.length-1) return true;
            

        }
        return true;

    }
}