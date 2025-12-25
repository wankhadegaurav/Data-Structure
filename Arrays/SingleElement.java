public class SingleElement{
    public static void main(String args[])
    {

        int arr[]={1,1,2,3,3,4,4,8,8};
        System.out.println("Single Element is :"+singleElement(arr));
    }
    public static int singleElement(int nums[])
    {
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
        int low=1;
        int high=nums.length-2;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid-1]!=nums[mid]){
                return nums[mid];
            }

            if((mid%2!=0 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1]))
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
       
    }
}