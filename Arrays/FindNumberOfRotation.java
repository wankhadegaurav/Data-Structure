public class FindNumberOfRotation 
{
    public static void main(String arg[])
    {
        int arr[]={3,4,5,1,2};
        System.out.println("number of Rotation "+numberOfRotation(arr));
    
    }

    // brute  forece approach for it 
    // public static int numberOfRotation(int nums[])
    // {
    //     int min=nums[0];
    //     for(int i=1;i<nums.length;i++){
    //         if(min>nums[i]){
    //             min=nums[i];
    //         }
    //     }
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(min==nums[i]){
    //             return i;
    //         }
    //     }
    //     return 0;
    // }


    // optimal approach for it (log n)
      public static int numberOfRotation(int nums[])
      {
          int low=0;
          int high=nums.length-1;
          int index=0;
          int min=Integer.MAX_VALUE;
          while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                if(min>nums[low]){
                    min=nums[low];
                    index=low;
                }
                low=mid+1;
            }
            else{
                if(min>nums[mid]){
                    min=nums[mid];
                    index=mid;
                }
                high=mid-1;
            }

        }
        return index;
      }



    
}
