public class Practice3 {
    public static void main(String args[])
    {
         int arr[]={0,4,0,6,8,0,59,5};
         int first=0;
         int last=arr.length-1;
        int arr1[]= function1(arr, first, last);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr[i]);
        }

        
        
    }
    public static int [] function1(int arr[],int first ,int last ){
         if(first<=last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            
            function1(arr, first+1, last-1);
         }
         return arr;

         
    }
   
    
}
