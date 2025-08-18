import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongIncSub 
{

    public static void main(String[] args)
    {

        int nums[]={10,9,2,5,3,7,101,18};
       System.out.println(longessubseq(nums, 0, 0,-1));
       
        

    }
    public static int  longessubseq(int arr[],int index,int length,int previous)
    {

        if(index==arr.length)
        {
            return 0 ;
        }
        int take=0;
       
        if(previous==-1||arr[index]<arr[previous]){
         take= 1+longessubseq(arr, index+1, length+1,index);
        }
       
        int skip=longessubseq(arr, index+1, length, previous);
        
      return Math.max(take, skip);
    }
}
