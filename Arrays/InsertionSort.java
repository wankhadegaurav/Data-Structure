public class InsertionSort 
{
    public static void main(String args[])
    {
        int nums[]={7,4,1,5,3};

        nums=inserationSort(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }

    }
    public  static int[] inserationSort(int arr[])
    {
        int key=0;
        int j;
        for(int i=1;i<arr.length;i++)
        {
            key=arr[i];
            j=i-1;
             while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
             }
             arr[j+1]=key;
        }
        return arr;
    }
  
    
}
