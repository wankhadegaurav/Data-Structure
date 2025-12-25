import java.util.ArrayList;
import java.util.List;

public class IndexSubarraySum 
{
    public static void main(String args[])
    {
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer>list=indexSubarraySum(arr, 15);
        System.out.println(list);

    }
    // public static ArrayList<Integer> indexSubarraySum(int arr[],int target)
    // {
    //     int sum=0;
    //     ArrayList<Integer> list=new ArrayList<>();
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         for(int j=i;j<arr.length;j++)
    //         {
    //             sum=sum+arr[j];
    //             if(sum==target)
    //             {
    //                 list.add(i+1);
    //                 list.add(j+1);
    //                 return list;
    //             }
               
    //         }   
    //         sum=0;
    //     }
    //     list.add(-1);
    //     return list;
    // }

    public static ArrayList<Integer>  indexSubarraySum(int nums[],int target)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int start=0;
        int end=0;
        int sum=0;
        while(end<nums.length)
        {
            sum+=nums[end];
             while(sum>target){
                sum-=nums[start];
                start++;
            }
            if(sum==target){
                list.add(start+1);
                list.add(end+1);
                return list;
            }
           
            end++;

        }
        list.add(-1);
        return list;

    }
    
}
