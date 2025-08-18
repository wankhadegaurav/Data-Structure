import java.util.ArrayList;
import java.util.List;

public class Subsequence{
     public static List<Integer> funtion(int index,int arr[],ArrayList<Integer> list,int length){
      if(index>=length){
        System.out.println(list);
        return list;
      }
      list.add(arr[index]);
      funtion(index+1,arr,list,length);
      list.remove(list.size() - 1);
      return funtion(index+1,arr,list,length);
     
     }
  
  public static void main(String[] args) 
  {
    int arr[]={3,1,2};
    int index=0;
    int length=arr.length;
    ArrayList<Integer> list=new ArrayList<>();
  funtion(index,arr,list,length);

  }
}