public class LowerBound 
{
    public static void main(String args[])
    {
        int nums[]={3,5,8,15,19};
        System.out.println(lowerBound(nums, 9));

    }

    // the brute force approach for it 
    // public static int lowerBound(int nums[],int key)
    // {
    //    int left=0;
    //    while(left<nums.length)
    //     {
    //         if(nums[left]>=key) return left;
    //         left++;
    //    }
    //    return nums.length;
    // }

    public static int lowerBound(int nums[],int key)
    {
       int low=0;
       int high=nums.length-1;
       int ans=nums.length-1;
       while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>=key){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
       }
       return ans;
    }
    
}
