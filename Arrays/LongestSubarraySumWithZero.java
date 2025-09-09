import java.util.HashMap;

public class LongestSubarraySumWithZero 
{
    public static void main(String args[])
    {
     int arr[]={9, -3, 3, -1, 6, -5};
     int target=0;
     System.out.println(LongestSubarraySumWithZero(arr, target));
    }
    //brute force appraoch for it Tc -O(n2) and Sc O(1)
    // public static int LongestSubarraySumWithZero(int arr[],int target)
    // {
    //     int sum=0;
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         sum+=arr[i];
    //         for(int j=i+1;j<arr.length;j++){
    //             sum+=arr[j];
    //             if(sum==target)
    //             {
    //                 max=Math.max(max,j-i+1);
    //             }
    //         }
    //         sum=0;
    //     }
    //     return max;
      
    // }


    // optimal approach for it Tc O(n) and sc O(n)
    public static int LongestSubarraySumWithZero(int arr[],int target)
    {
     int maxi=Integer.MIN_VALUE;
     int sum=0;
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<arr.length;i++)
     {
        sum+=arr[i];
        if(sum==0){
            maxi=i+1;
        }
        else
        {
            if(map.containsKey(sum)){
                maxi=Math.max(maxi,i-map.get(sum));
            }
            else{
                 map.put(sum,i);
            }

        }
       
     }   
     return maxi;

    }
    
}
