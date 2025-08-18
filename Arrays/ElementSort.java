public class ElementSort 
{
    public static void main(String[] args)
    {
       int arr[]={5,7,7,8,8,10};
       int target=8;
       int nums[]=findFirstAndLastPosition(arr, target);
       for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
       }
    }
    // let to solve it 
    
    public static int[] findFirstAndLastPosition(int nums[],int target)
    {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return new int[]{mid,mid+1};
            }
            if(target<nums[mid]){
                high=mid-1;
              low++;
            }
            else{
                low=mid+1;
                high++;
            }

        }
        return new int[] {-1,-1};

    }
    
}
