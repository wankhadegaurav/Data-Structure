import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsectiveSequence
{
    public static void main(String[] args)
    {
        int arr[]={100,200,1,3,2,4};
        System.out.println(longestConsectiveSequence(arr));
        
    }
    // better approach for  it when there is no hashcollsion;

    // public static int longestConsectiveSequence(int nums[])
    // {
    //     Arrays.sort(nums);
    //     int longest=1;
    //     int count=0;
    //     int smallest=Integer.MIN_VALUE;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //        if((nums[i]-1)==smallest){
    //         count+=1;
    //         smallest=nums[i];
    //        }
    //       else if((nums[i]-1)!=smallest){
    //         count=1;
    //         smallest=nums[i];
    //       }
    //        longest=Math.max(longest, count);
    //     }
    //         return longest;
    // }

    // optimal approach but no hashcollision
    public static int longestConsectiveSequence(int nums[])
    {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=0;
        int longest=1;
        for(int i:set)
        {
           if(!set.contains(i-1))
           {
            count=1;
            int  x=i+1;
             while(set.contains(x))
             {
                count++;
               x++;
             }
             longest=Math.max(longest,count);
           }
        }
        return longest;

    }

}