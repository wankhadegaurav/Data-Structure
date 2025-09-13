import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OverlappingMerageArray
{
    public static void main(String args[])
    {
        int arr[][]={{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};
        // List<List<Integer>> list=overLappingMerage(arr);
        // for(List<Integer> li:list){
        //     System.out.println(li);
        // }
        int nums[][]=overLappingMerage(arr);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.println(nums[i][j]);
            }
        }
       
    }

    // one of the way for the overlapping merging array
    //public static List<List<Integer>> overLappingMerage(int arr[][])
    // {
    //     Arrays.sort(arr,new Comparator<int[]>() {

    //         @Override
    //         public int compare(int[] a, int[]b) {
    //             return a[0]-b[0];
                
    //         }
            
    //     });

    //     List<List<Integer>> ans=new ArrayList<>();
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(ans.isEmpty()||arr[i][0]>ans.get(ans.size()-1).get(1))
    //         {
    //             ans.add(Arrays.asList(arr[i][0],arr[i][1]));
    //         }
    //         else
    //         {
    //            ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr[i][1]));

    //         }
    //     }
    //     return ans;
    // }

    // less complex in writing the code for 2D array
    public static int [][] overLappingMerage(int arr[][])
    {
        Arrays.sort(arr,new Comparator<int[]>() {

            @Override
            public int compare(int[] a, int[]b) {
                return a[0]-b[0];
                
            }
            
        });
        if(arr.length<=1) return arr;
        List<int[]> merge=new ArrayList<>();
        int current[]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0]<=current[1]){
                current[1]=Math.max(arr[i][1],current[1]);
            }
            else
            {
                merge.add(current);
                current=arr[i];
            }
        }
        merge.add(current);
        return merge.toArray(new int[merge.size()][]);

    }
    
    
}