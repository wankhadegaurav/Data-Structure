public class CountOccurentOfElement 
{
    public static void main(String args[]){
        int arr[]={1, 1, 2, 2, 2, 2, 2, 3};
        int target=2;
       int start=startIndex(arr, target);
       if(start!=-1){
         int length=(endIndex(arr, target)-startIndex(arr, target))+1;
         System.out.println("Total Element is :"+length);
       }
        
    }

    // brute forece approach   for it 

public static int countNumber(int arr[],int target){
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            count++;
        }
    }
    return count;
}




    public static int startIndex(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        int start=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target){
                start=mid;
                high=mid-1;
            }
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;

        }
        return start;
    }
    public static int endIndex(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        int end=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
               end=mid;
               low=mid+1;
            }
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return end;
    }
    
}
