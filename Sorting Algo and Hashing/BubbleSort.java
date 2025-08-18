public class BubbleSort
{
    public static void main(String[] args)
    {
        // int arr[]={13,46,24,52,20,9};
        int arr[]={1,2,3,4,5,6};
        bubbleSort(arr);

      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }

    }
    // public static void bubbleSort(int arr[])
    // {
    //     for(int i=arr.length-1;i>=1;i--){
    //         for(int j=0;j<=i-1;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp=arr[j+1];
    //                 arr[j+1]=arr[j];
    //                 arr[j]=temp;
    //             }
    //         }
    //     }

    // }
    public static void bubbleSort(int arr[]){
        boolean flage=false;
        for(int i=arr.length-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flage=true;
                }
            }
            if(flage){
                break;
            }
        }
    }
    
}
