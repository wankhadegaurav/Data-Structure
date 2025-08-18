import java.util.ArrayList;
import java.util.List;

public class NextRightGreatest1 
{
    public static void  main(String[] args)
    {
        int nums1[]={2,4};
        int nums2[]={1,2,3,4};
        List<Integer>list=new ArrayList<>();
        for(int i:nums2){
            list.add(i);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i:nums1){
            if(list.contains(i)) {
                int index=list.indexOf(i);
                 boolean found=false;
            for(int j=index+1;j<list.size();j++)
            {
                if(i<list.get(j)){
                    ans.add(list.get(j));
                    found=true;
                    break;
                }
            }
            if(!found){
                ans.add(-1);
            }
            }
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    
}
