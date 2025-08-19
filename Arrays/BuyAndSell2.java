public class BuyAndSell2 
{
    public static void main(String args[])
    {
        int prices[]={3,6,9,2,1};
        System.out.println(BuyAndSellTwo(prices));
    }
    public static int BuyAndSellTwo(int nums[])
    {
       int profit=0;
       for(int i=1;i<nums.length;i++)
       {
         if(nums[i-1]<nums[i])
         {
            profit+=nums[i]-nums[i-1];

         }

       }
       return profit;

    }
    
}
