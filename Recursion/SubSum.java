import java.util.ArrayList;
import java.util.List;

public class SubSum {
    public static void main(String[] arg)
    {
        int sum=2;
        int arr[]={1,2,1};
        ArrayList<Integer>list=new ArrayList<>();
        int value=0;
        int index=0;
     sumSub(index,arr,list,sum,value);

    }
    public static void sumSub(int index,int arr[],List<Integer> list,int sum,int value)
    {
        if(index==arr.length){
            if(value==sum){
                System.out.println(list);
               
            }
            return;
        }
        list.add(arr[index]);
        
        sumSub(index+1, arr, list, sum, value+arr[index]);
        list.remove(list.size()-1);
       
        sumSub(index+1, arr, list, sum, value);

    }
    
}
