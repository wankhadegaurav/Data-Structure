public class ProductSubarray
{
    public  static void main(String args[])
    {
        int nums[]={2,3,-2,4};
        System.out.println("max "+prouductSubarray(nums));
    }

    // brute force appraoch
    // public static int prouductSubarray(int nums[])
    // {
    //     int max=Integer.MIN_VALUE;
    //         int product=1;

    //     for(int i=0;i<nums.length;i++)
    //     {
    //         for(int j=i;j<nums.length;j++)
    //         {
    //             product=product*nums[j];
    //             max=Math.max(max, product);
    //         }
    //         product=1;
    //     }
    //     return max;
    // }

    // optimal approach for it 
    public static int prouductSubarray(int nums[])
    {
        int max=Integer.MIN_VALUE;
        int prefex=1;
        int suffex=1;
        for(int i=0;i<nums.length;i++)
        {
            if(prefex==0) prefex=1;
            if(suffex==0) suffex=1;
            
            prefex=prefex*nums[i];
            suffex=suffex*nums[nums.length-1-i];
            max=Math.max(max, Math.max(prefex, suffex));
        }
        return max;
    }
}