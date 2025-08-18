public class SelectionSort
{
    public static void main(String[] args)
    {
        int arr[]={13,46,24,52,20,9};
          
        selectionSort(arr);
         
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }

    }
    public static  void selectionSort(int arr[]){
        int min=0;
        for(int i=0;i<=arr.length-2;i++){
            min=i;
            for(int j=i;j<=arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
    }
    
}