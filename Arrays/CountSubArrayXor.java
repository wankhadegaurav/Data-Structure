public class CountSubArrayXor 
{
    public static void main(String args[])
    {
       int arr[]={4, 2, 2, 6, 4};
      int k=6;
      System.out.println(CountSubArrayXor(arr, k));
       
    }
    // brute force Approach for it O(N2) and sc O(1)
    public static int CountSubArrayXor(int arr[],int k)
    {
        int count=0;
        for(int i=0;i<arr.length;i++){
             int xor=0;
            for(int j=i;j<arr.length;j++)
            {
                xor^=arr[j];    
                if(k==xor){
                    count++;
                }
            }
            
        }
        return count;
    }

  
    
}
