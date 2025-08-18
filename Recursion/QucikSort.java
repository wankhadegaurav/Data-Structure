public class QucikSort
{
    public static void main(String[] args)
    {
        int arr[]={4,6,2,5,7,9,1,3};
        int low=0;
        int high=arr.length-1;
        quickSort(arr, low, high);


       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }


    }
    public static void quickSort(int arr[],int low ,int high)
    {
        if(low<high)
        {
          int partition=functionPivot(arr,low,high);
          quickSort(arr, low, partition-1);
          quickSort(arr, partition+1, high);
        }

    }
    public static int functionPivot(int arr[],int low,int high)
    {
      int pivot=arr[low];
      int i=low;
      int j=high;
      while(i<j){
        while(arr[i]<=pivot&&i<=high-1)
        {
            i++;
        }
        while(arr[j]>pivot&&j>=low+1)
        {
            j--;
        }
        if(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
      }
      int temp=arr[j];
      arr[j]=arr[low];
      arr[low]=temp;
      return j;
    }

    
    
}
