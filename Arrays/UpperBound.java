public class UpperBound 
{
    public static void main(String[] args) 
    {
        int nums[]={1,2,2,3};
        int key=9;    
        System.out.println(upperbound(nums, key));
    }
    // optimal approach for these question
    public static int upperbound(int nums[],int key)
    {
        int low=0;
        int high=nums.length-1;
        int ans=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>key){
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
