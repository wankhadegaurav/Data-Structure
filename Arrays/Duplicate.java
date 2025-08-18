

public class Duplicate 
{
    public static void main(String args[]){
        int nums[]={0,0,1,1,1,2,2,2,3,3,4};
      int length=removeDuplicate(nums);
      for(int i=0;i<length;i++){
        System.out.print(nums[i]+" ");
      } 
         
    }
    public static int  removeDuplicate(int nums[])
    {
        // List<Integer> list=new ArrayList<>();
        // for(int i:nums){
        //     if(!list.contains(i)){
        //         list.add(i);
        //     }
        // }
        // for(int i=0;i<list.size();i++){
        //     nums[i]=list.get(i);
        //     System.out.print(nums[i]+" ");
        // }

       int slow=0;
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[slow]){
            slow++;
            nums[slow]=nums[i];
        }
       }
       return slow+1;

    }
    
}
