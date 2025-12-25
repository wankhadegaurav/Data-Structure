public class floor 
{
    public static void main(String args[])
    {
        int arr[]={3,4,4,7,8,10};
        int x=5;
        // System.out.println("Floor value :"+floor(arr, x));
        System.out.println("Ceiling value :"+ceiling(arr, x));

    }
    // public static int floor(int arr[],int x)
    // {
    //     int low=0;
    //     int high=arr.length-1;
    //     int answer=-1;
    //     while(low<=high)
    //     {
    //         int mid=(low+high)/2;
    //         if(arr[mid]<=x)
    //         {
    //             answer=arr[mid];
    //             low=mid+1;    
    //         }
    //         else{
    //             high=mid-1;
    //         }

    //     }
    //     return answer;

    // }

    public static int ceiling(int arr[],int x)
    {
        int low=0;
        int high=arr.length-1;
        int answer=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                answer=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return answer;

    }
    
}
