import java.util.ArrayList;
import java.util.List;

public class Arragment 
{
    public static void main(String args[])
    {
        int arr[]={3,1,-2,-5,2,-4};
        int nums[]=arragement(arr);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static int[] arragement(int nums[])
    {
    //   List<Integer> list=new ArrayList<>();
    //   List<Integer> list1=new ArrayList<>();

    //     for(int i=0;i<nums.length;i++)
    //     {
    //       if(nums[i]>0)
    //       {
    //          list.add(nums[i]);
    //       }
    //       else{
    //         list1.add(nums[i]);
    //       }
    //     }
    //     boolean flag=true;
    //     int arr[]=new int[nums.length];
    //     int index=0;
    //     for(int i:list)
    //     {
    //       arr[index]=i;
    //       index+=2;
    //     } 
    //     int j=1;
    //     for(int i:list1){
    //         arr[j]=i;
    //         j+=2;
    //     }
    //     return arr;

     int arr[]=new int[nums.length];
     int odd=1;
     int even=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]>0){
            arr[even]=nums[i];
            even+=2;
        }
        else{
            arr[odd]=nums[i];
            odd+=2;
        }

    }
    return arr;
    }

    
}
