public class BinearySearch 
{
    public static void main(String args[])
    {
        int nums[]={3,4,5,6,7,8,9,12};
        int target=6;
        // System.out.println(binearySearch(nums, target));
        System.out.println(binearySearch(nums, target, 0, nums.length-1));
    }

    // by using the while loop condition
    // public static  int binearySearch(int nums[],int target)
    // {
    //     int low=0;
    //     int high=nums.length-1;
    //     while(low<=high)
    //     {
    //       int mid=(low+high)/2;
    //       if(nums[mid]==target) return mid;
    //       else if(target>nums[mid]) low=mid+1;
    //       else high=mid-1;
    //     }
    //     return -1;

    // }

    // by using the recursion approach 

    public static int binearySearch(int nums[],int target,int low,int high)
    {
         int mid=(low+high)/2;
        if(low>=high) return -1;
        else if(target==nums[mid]) return mid;
        else if(target>nums[mid]) return binearySearch(nums, target, mid+1, high);
        return binearySearch(nums, target, low, mid-1);
       
    }

    
}
