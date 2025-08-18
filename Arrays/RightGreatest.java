public class RightGreatest 
{
    public static void main(String args[]){
       int arr[]={17,18,5,4,6,1};
       //int nums[]=RightGreatest(arr);
       int nums[]=rightArrrangment(arr);
       for(int i=0;i<nums.length;i++)
       {
        System.out.print(nums[i]+" ");

       }
    }
    // public static int[] RightGreatest(int nums[])
    // {
    //     int arr[]=new int[nums.length];
    //     for(int i=0;i<nums.length;i++)
    //     {
    //        if(i<nums.length-1){
    //         arr[i]=greatesnumber(nums,i+1,nums.length-1);
    //        }
           
    //     }
    //     arr[arr.length-1]=-1;
    //     return arr;

    // }
    // public  static int greatesnumber(int nums[],int first,int last){
    //     int greater=nums[first];
    //     for(int i=first;i<=last;i++)
    //     {
    //         if(greater<nums[i]){
    //             greater=nums[i];
    //         }
    //     }
    //     return greater;
    // }

    // optimized way for the code O(n)
    public static int[] rightArrrangment(int nums[]){
        int arr[]=new int[nums.length];
        int max=-1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=max;
            max=Math.max(max,nums[i]);
        }
        return arr;
    }
    
}
