public class RotateArray 
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int nums[]=rotateArray(arr, k);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        
    }
    // tc is o(n) and sc-O(n);
    // public static int[] rotateArray(int arr[],int k)
    // {
    //     int nums[]=new int[arr.length];
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         nums[(i+k)%arr.length]=arr[i];
    //     }
    //     return nums;
    // }
    public static int[] rotateArray(int arr[],int k)
    {
        k=k%arr.length;
       reverse(arr, 0, arr.length-1);
       reverse(arr, 0, k-1);
       reverse(arr, k, arr.length-1);
       return arr;
    }
    public static void reverse(int arr[],int start,int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
   
}
