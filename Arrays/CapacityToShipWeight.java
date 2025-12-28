import java.util.Arrays;

public class CapacityToShipWeight 
{
    public static void main(String args[])
    {
        int nums[]={7, 2, 5, 10, 8};
        int day=2;
        System.out.println(minimumWeight(nums, day));

    }


    // brute force approach for it 
    public static int minimumWeight(int nums[],int day)
    {
        for(int i=1;i<=sum(nums);i++){
            if(possible(nums, i, day)){
                return i;
            }
        }
        return -1;
    }
    

    // public static int minimumWeight(int nums[],int day)
    // {
    //    int low=Arrays.stream(nums)
    //    .max().getAsInt();
       
    //    int high=sum(nums);
    //    int ans=0;
       
    //    while(low<=high)
    //     {
    //         int mid=(low+high)/2;
    //         if(possible(nums, mid, day))
    //         {
    //             ans=mid;
    //             high=mid-1;    
    //         }
    //         else{
    //             low=mid+1;
    //         }
    //     }
    //     return ans;
    // }

    public static boolean possible(int nums[],int weight,int day)
    {
        int sum=0; int currentday=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<=weight){
                continue;
            }
            else if(sum>=weight)
            {
                currentday++;
                sum=0;
                sum=nums[i];
            }
        }
        if(sum<=weight)
        {
            currentday++;
        }
        if(currentday<=day)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static int sum(int nums[]){
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        return sum;
    }
    
}
