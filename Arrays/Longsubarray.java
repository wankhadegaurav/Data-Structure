import java.util.HashMap;

public class Longsubarray 
{
    public static void main(String[] args)
    {
    //    // longest subarray for the given length k 
    //    int arr[]={2,3,5,1,9};
    //    // it is optimal approch for the subarray length sum 
    //   // System.out.println(longsubarray(arr, 10));
        

    // it is a optimal approach for postive and negative value in the array
     int arr[]={-1,1,1};
     int k=1;
     System.out.println(longSubArray( arr,k));

    }
    // public static int longsubarray(int arr[],int k)
    // {
    //     int maxlen=0;
    //     int sum=arr[0];
    //     int left=0;
    //     int right=0;
    //     while(right<arr.length){
    //         while(left<=right&&sum>k){
    //             sum-=arr[left];
    //             left++;
    //         }
    //         if(sum==k){
    //             maxlen=Math.max(maxlen,right-left+1);
    //         }
    //         right++;
    //       if(right<arr.length) sum+=arr[right];
    //     }

    //    return maxlen;
    // }

    public static int longSubArray(int arr[],int k)
    {
        int sum=0;
        int maxlen=0;
        // key as a sum and value  as index 
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int  i=0;i<arr.length;i++)
        {
             sum+=arr[i];
             if(sum==k)
             {
                maxlen=Math.max(maxlen,i+1);
             }
             int rem=sum-k;

             if(map.containsKey(rem))
             {
               int length=i-map.get(rem);
               maxlen=Math.max(maxlen,length);
             }
             if(!map.containsKey(sum)){
                map.put(sum,i);
             }
             
        }
        return maxlen;

    }
    
}
