import java.util.ArrayList;
import java.util.List;

public class Permutation
{ 
   public static void main(String[] args)
   {
    int nums[]={1,2,3};
    List<List<Integer>> list=new ArrayList<>();
    Permutation(nums, list, 0);
    System.out.println(list);
       
   }
   // understand the recursion tree for it 
   
   public static void Permutation(int arr[],List<List<Integer>> list,int index)
   {
    if(index==arr.length)
    {
        List<Integer> ds=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            ds.add(arr[i]);
           
        }
        list.add(new ArrayList<>(ds));
        return;
    }
    for(int i=index;i<arr.length;i++)
    {
        swap(i,index,arr);
        Permutation(arr,list,index+1);
        swap(index,i,arr);
    }

   }

   public static void swap(int i,int index,int arr[]){
    int temp=arr[index];
    arr[index]=arr[i];
    arr[i]=temp;
   }
}