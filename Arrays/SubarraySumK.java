import java.util.HashMap;

public class SubarraySumK 
{
    public static void main(String args[])
    {
      int arr[]={1,2,3};
      System.out.print(SubarraySumK(arr, 3));

    }

    public static int SubarraySumK(int nums[],int target)
    {
        int sum=0;
        int left=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        while(left!=nums.length)
        {
            sum+=nums[left];
            int remaining=sum-target;
            if(map.containsKey(remaining))
            {
                count+=map.get(remaining);
            }
                map.put(sum,map.getOrDefault(sum, 0)+1);
            left++;
        }
        return count;
    }
    
}
