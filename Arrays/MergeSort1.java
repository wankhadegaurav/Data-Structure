import java.util.ArrayList;
import java.util.List;

public class MergeSort1 
{
    public static void main(String args[])
    {
        int arr[]={3,2,8,5,1,4,2,3};
        mergeSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
    public static void mergeSort(int nums[],int low,int high)
    {
        if(low>=high) return;
       int mid=(low+high)/2;
       mergeSort(nums, low, mid);
       mergeSort(nums, mid+1, high);
       merge(nums,low,mid,high);
    }
    public static void merge(int nums[],int low,int mid,int high)
    {
        List<Integer> list=new ArrayList<>();
        int left=low;
        int right=mid+1;

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
        for(int i=low ;i<=high;i++){
            nums[i]=list.get(i-low);
        }
        
    }
  
    
}
