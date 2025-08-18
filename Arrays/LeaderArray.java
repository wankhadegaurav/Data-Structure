import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderArray{
    public static void main(String args[]){
        int arr[]={10,22,12,3,0,6};
        int nums[]=leader(arr);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");

        }
    }
    // as it take the O(N2 ) complextiy i have to reduce it to o(n);
    // public static int [] leader(int nums[])
    // {
    //     int left=0;
    //     int right=nums.length-1;
    //     List<Integer> list=new ArrayList<>();
    //     while(left!=nums.length-1)
    //     {
    //         if(nums[left]<nums[right]){
    //             left++;
    //             right=nums.length-1;
    //             continue;
    //         }
    //        if(left==right){
    //         list.add(nums[left]);
    //        }
    //         if(right<left){
    //             left++;
    //             right=nums.length-1;
    //         }
    //         right--;
    //     }
    //     list.add(nums[nums.length-1]);
    //     int arr[]=new int[list.size()];
    //     for(int i=0;i<list.size();i++)
    //     {
    //         arr[i]=list.get(i);
    //     }
    //     return arr;

    // }


    // optimized way 
    public static int[] leader(int nums[])
    {
        int max=0;
        List<Integer>list=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            
            if(nums[i]>max){
                list.add(nums[i]);
            }
            max=Math.max(max,nums[i]);
        }
        Collections.reverse(list);
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
           arr[i]=list.get(i);
        }
        return arr;

    }
}