import java.util.HashMap;

public class CountSubAraryXor 
{
    public static void main(String args[])
    {
       int arr[]={4,2,2,6,4};
       int k=6;
       System.out.println(countSubAraryXor(arr, k));
    }

    // brute force appraoch for it  tc=O(n2) sc=(1)
    // public static int countSubAraryXor(int arr[],int k)
    // {
    //     int xor;
    //     int count=0;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         xor=0;
    //         for(int j=i;j<arr.length;j++)
    //         {
    //             xor^=arr[j];
    //             if(xor==k) count++;

    //         }
    //     }
    //     return count;
      
    // }

    // optimal approch for it using prefix sum logic 
    public static int countSubAraryXor(int arr[],int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int xor=0;
        int count=0;
        map.put(xor,1);
        for(int i=0;i<arr.length;i++)
        {
            xor^=arr[i];
            int x=xor^k;
            if(map.containsKey(x)) {
                count+=map.get(x);
            }
            if(map.containsKey(xor)){
                map.put(xor,map.get(xor)+1);
            }
            else{
                map.put(xor,1);
            }
        }
        return count;

    }

    
    
}
