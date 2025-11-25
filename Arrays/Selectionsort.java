public class Selectionsort 
{
    public static void main(String args[])
    {
        int arr[]={7,5,9,2,6};
        arr=selectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
    public static int[] selectionSort(int arr[])
    {
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;

    }
    
}
