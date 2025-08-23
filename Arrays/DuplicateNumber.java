public class DuplicateNumber 
{
    public static void main(String args[]){
      int nums[]={3,1,3,4,2};
      findDuplicatNumber(nums);

    }
  
    public static void findDuplicatNumber(int nums[])
    {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]+=1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    
    
}
