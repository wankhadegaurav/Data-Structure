import java.util.Arrays;

// public class Repeating
// {
//     public static void main(String args[])
//     {
//         int arr[]={3, 5, 4, 1, 1};
//         arr=repeatingNumber(arr);
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.println(arr[i]);

//         }
        
//     }


    // // brute force approach 
    // public static int[] repeatingNumber(int arr[])
    // {
    //     int missing=-1;
    //     int repeating=-1;
    //     int count=0;
    //     for(int i=1;i<arr.length;i++)
    //     {
    //             count=0;
    //        for(int j=0;j<=arr.length-1;j++)
    //         {
    //             if(i==arr[j]){
    //                 count++;
    //             }
    //        }     
    //        if(count==2)repeating=i;
    //             else if(count==0) missing=i;
    //             else if(missing!=-1 && repeating!=-1) break;

    //     }
    //     return new int[]{repeating,missing};

    // }


    // better approach for it 
    // public static int[] repeatingNumber(int arr[])
    // {
    //     int nums[]=new int[arr.length+1];
    //     int value[]=new int[2];
    //     int duplicate=0;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(nums[arr[i]]==0){
    //             nums[arr[i]]=1;
    //         }
    //         else{
    //             duplicate=arr[i];
    //         }

    //     }
    //     for(int i=1;i<nums.length;i++)
    //     {
    //         if(nums[i]==0)
    //         {
    //             value[0]=duplicate;
    //             value[1]=i;
    //         }
    //     }
    //     return value;

    // }




}