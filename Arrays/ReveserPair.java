import java.util.ArrayList;
import java.util.List;

public class ReveserPair 
{
    public static void main(String args[])
    {
        int nums[]={2,4,3,5,1};
        System.out.println(reversePair(nums));
        
    }
    
    // brute force approach 
    // public static int reversePair(int nums[])
    // {
    //     int count=0;
    //     for(int i=0;i<nums.length-1;i++)
    //     {
    //         for(int j=i+1;j<nums.length;j++)
    //         {
    //             if(nums[i]>(2*nums[j]))count++;

    //         }

    //     }
    //     return count;
    // }


    // optimal approach for it 
    public static int reversePair(int nums[])
    {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static int mergeSort(int nums[],int low,int high)
    {
        int count=0;
        if(low==high) return count;
        int mid=(low+high)/2;
       count+=mergeSort(nums, low, mid);
        count+=mergeSort(nums, mid+1, high);
        count+=countPair(nums, low, mid, high);
        merge(nums, low, mid, high);
        return count;
    }
    public static void merge(int nums[],int low,int mid,int high)
    {
        
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
                right++;
            }
        }
        if(left<=mid){
            while(left<=mid){
                list.add(nums[left]);
                left++;
            }
        }
        if(right<=high){
            while(right<=high){
                list.add(nums[right]);
                right++;
            }
        }
        for(int i=low;i<=high;i++)
        {
            nums[i]=list.get(i-low);
        }
     
    }
    public static  int countPair(int nums[],int low,int mid,int high)
    {
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && nums[i]>(2*nums[right]))
            {
                right++;
            }
            count+=(right-(mid+1));
        }

        return count;
    }


    
}
