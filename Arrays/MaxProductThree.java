import java.util.Arrays;

public class MaxProductThree 
{
    public static void main(String args[])
    {
        int nums[]={-1,-2,-3};
        System.out.println("max :"+maxProductThree(nums));
        
    }
    // brute force approach for it 
    // public static int maxProductThree(int nums[])
    // {
    //     int max=Integer.MIN_VALUE;
    //     int product=1;
    //     for(int i=0;i<nums.length-2;i++)
    //     {
    //         for(int j=i+1;j<nums.length-1;j++)
    //             {
                
    //             for(int k=j+1;k<nums.length;k++)
    //             {
    //                 product=nums[i]*nums[j]*nums[k];   
    //                 max=Math.max(max,product);
    //             }
    //         }
    //     }
    //     return max;
    // }

     public static int maxProductThree(int nums[])
     {
       int max1=Integer.MIN_VALUE;
       int max2=Integer.MIN_VALUE;
       int max3=Integer.MIN_VALUE;

       int min1=Integer.MAX_VALUE;
       int min2=Integer.MAX_VALUE;

       int max=Integer.MIN_VALUE;
       for(int num:nums)
        {
            if(num>max1)
            {
                max3=max2;
                max2=max1;
                max1=num;
            }
            else if(num>max2)
            {
                max3=max2;
                max2=num;
            }
            else if(num>max3){
                max3=num;
            }
            if(num<min1)
            {
                min2=min1;
                min1=num;
            }
            else if(num<min2)
                {
                min2=num;
            }
          
       }
        max=Math.max(max,Math.max(max1*max2*max3,min1*min2*max1));
       return max;



     }
    
}
