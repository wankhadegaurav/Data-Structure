public class BuyAndSell 
{
    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        System.out.println(profit(arr));
    }
    public static int profit(int nums[]){
       int profit=0;
       int pmin=nums[0];
       for(int i=1;i<nums.length;i++){
         if(pmin>nums[i]){
            pmin=nums[i];
             }
             else{
                profit=Math.max(profit,nums[i]-pmin);

             }
       }
       return profit;
    
    }
    
    
}
