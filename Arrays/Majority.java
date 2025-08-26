import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority 
{
    public static void main(String args[]) {
         int nums[]={1,2,3,4,2,2}; 
         System.out.println(majorityElement(nums));

    }   
     public  static List<Integer> majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            
        
                map.put(i,map.getOrDefault(i,0)+1);
               
            
           
                if(map.get(i)>(nums.length/3)){
                list.add(i);
           
            }
        }
        return list;
        
    }
}
