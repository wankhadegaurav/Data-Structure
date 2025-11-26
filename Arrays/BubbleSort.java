    import java.util.Arrays;

    public class BubbleSort 
    {
        public static void main(String args[])
        {
            int arr[]={1,2,3,4,5,6};
            Arrays.stream(bubbleSort(arr))
            .forEach((x)->System.out.println(x));
            

        }
        // worest case for the bubble sort 
        // public static int[] bubbleSort(int nums[])
        // {
        //     for(int i=nums.length-1;i>=0;i--)
        //     {
                
        //         for(int j=0;j<i;j++)
        //         {
        //             if(nums[j]>nums[j+1]){
        //                 int temp=nums[j];
        //                 nums[j]=nums[j+1];
        //                 nums[j+1]=temp;
        //             }
        //         }
        //     }
        //     return nums;
        // }
        
        // optimal approach for the bubble sort if the array is already in the sorted form 
        
        public static int[] bubbleSort(int nums[])
        {
            for(int i=nums.length-1;i>=0;i--)
            {
                boolean flag=false;
                for(int j=0;j<i;j++)
                {
                    if(nums[j]>nums[j+1]){
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                        flag=true;
                    }

                }
                if(!flag) break;

            }
            return nums;

        }
        
    }
