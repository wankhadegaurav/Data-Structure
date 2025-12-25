import java.util.Arrays;

public class QuickSort1 
{
    public static void main(String args[])
    {
        int nums[]={78,45,79,2,72,1,3,5};
        quickSort(nums, 0, nums.length-1);
        Arrays.stream(nums)
        .forEach((x)->System.out.println(x));
    }
    public static void quickSort(int nums[],int low,int high)
    {
        if(low<high)
        {
            int indexpivote=partitionIndex(nums, low, high);
            quickSort(nums, low, indexpivote-1);
            quickSort(nums, indexpivote+1, high);
        }
    }
    public static int partitionIndex(int nums[],int low,int high)
    {
        int pivot=nums[low];
        int i=low;
        int j=high;
        while(i<j)
        {
              while(nums[i]<=pivot && i<high) i++;
              while(nums[j]>pivot && j>low) j--;
              if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
              }
        }
        int temp=pivot;
        nums[low]=nums[j];
        nums[j]=temp;
        return j;

    }
    
}
