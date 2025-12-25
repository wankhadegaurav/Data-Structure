import java.util.ArrayList;
import java.util.List;

public class CountInversion 
{
    public static void main(String args[])
    {
        int nums[]={5,4,3,2,1};
        System.out.println("CountInversion "+countInversion(nums,0,nums.length-1));
    }


    // brute force appraoch On2 

    // public static int countInversion(int nums[])
    // {
    //     int count=0;
    //     for(int i=0;i<=nums.length-2;i++){
    //         for(int j=i+1;j<=nums.length-1;j++){
    //             if(nums[j]<nums[i]) count++;
    //         }
    //     }
    //     return count;

    // }


    // here we will use the merge sort 
    public static int countInversion(int nums[],int low,int high)
    {
        int count=0;
       if(low>=high) return count;

       int mid=(low+high)/2;
       count+=countInversion(nums, low, mid);
       count+=countInversion(nums, mid+1, high);
       count+=mergesort(nums, low,mid, high);
       return count;
    }

   // optimal approach for the mergesort
    public  static int  mergesort(int nums[],int low,int mid,int high)
    {
        int count=0;
        int left=low;
        int right=mid+1;

        List<Integer> list=new ArrayList<>();

         while(left<=mid && right<=high)
        {
            if(nums[left]<nums[right]){
                list.add(nums[left]);
               left++;
            }
            else{
                list.add(nums[right]);
                count+=(mid-left+1);
                right++;
            }
         }
         if(left<=mid){
            while(left<=mid)
            {
                list.add(nums[left]);
                left++;
            }
         }
         if(right<=high)
        {
            while(right<=high){
                list.add(nums[right]);
                right++;
            }
         }
         for(int i=low;i<high;i++)
        {
            list.add(i-low);
        }
        return count;

    }
    
}
