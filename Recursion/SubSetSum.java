import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSetSum 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> subsum=new ArrayList<>();
        int arr[]={3,2,1};
        subsum(arr,0,0,subsum);
        Collections.sort(subsum);
        for(int i: subsum){
            System.out.print(i+" ");
        }
        

    }
    public static void subsum(int arr[],int index,int sum,List<Integer>list)
    {
        if(index==arr.length){
            list.add(sum);
            return;
        }
        subsum(arr,index+1,sum+arr[index],list);
        subsum(arr,index+1,sum,list);

    }
    
}
