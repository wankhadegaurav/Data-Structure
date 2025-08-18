public class Pracitce8{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println(function(arr,0,0));
    }

    public static boolean function(int arr[],int i,int count){
        if(i==arr.length-1){
            return count==arr.length-1;
        }
        if(arr[i]<arr[i+1]){
            count++;
        }
        return function(arr, i+1, count);
    }
    {
        
    }
}