
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation 
{
    public static void main(String args[])
    {
        
        List<Integer> list=Arrays.asList(new Integer[]{2,1,5,4,3,0,0});
        List<Integer> ans=nextPermutation(list);
        
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");

        }


    }
    public static List<Integer> nextPermutation(List<Integer>list)
    {
      int index=-1;
        
        for(int i=list.size()-2;i>=0;i--)
        {
            if(list.get(i)<list.get(i+1)){
                index=i;
                break;
            }
        }

        if(index==-1){
            Collections.reverse(list);
        }
        for(int i=list.size()-1;i>=0;i--)
        {
           if(list.get(index)<list.get(i))
           {
             int temp=list.get(i);
             list.set(i,list.get(index));
             list.set(index,temp);
             break;
           }
        }
           List<Integer>sublist=list.subList(index+1, list.size());
           Collections.reverse(sublist);
           
           return list;

        
    }
    
}
