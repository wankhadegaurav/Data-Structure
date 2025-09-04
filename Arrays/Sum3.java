import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3 
{
    public static void main(String args[])
    {
       int arr[]={-1,0,1,2,-1,-4};
    //    Set<List<Integer>> set=sum3(arr);
    //    for(List<Integer> list:set){
    //     System.out.println(list);
    //    }
         List<List<Integer>> list=sum3(arr);
         for(List<Integer> i:list){
            System.out.println(i);
         }
        
        
    }


    // brute force approach for 3sum question
    // public static Set<List<Integer>> sum3(int arr[])
    // {
    //     HashSet<List<Integer>> set=new HashSet<>();
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++)
    //         {
    //             for(int k=j+1;k<arr.length;k++)
    //             {
    //                 List<Integer> list=new ArrayList<>();
    //                 if(arr[i]+arr[j]+arr[k]==0){
    //                     list.add(arr[i]);
    //                     list.add(arr[j]);
    //                     list.add(arr[k]);
    //                     Collections.sort(list);
    //                     set.add(list);  
    //                 }
    //             }
    //         }
    //     }
    //     return set;
    // }

    // better approch for 3sum here  the time complexity 
    // public static Set<List<Integer>> sum3(int arr[])
    // {
    //  List<Integer> hashing=new ArrayList<>();
    //  Set<List<Integer>> set=new HashSet<>();
    //  for(int i=0;i<arr.length;i++){
    //     for(int j=i+1;j<arr.length;j++){
    //         int third=-(arr[i]+arr[j]);
    //         List<Integer> ans=new ArrayList<>();
    //        if(hashing.contains(third)){
    //         ans.add(arr[i]);
    //         ans.add(arr[j]);
    //         ans.add(third);
    //         Collections.sort(ans);
    //         set.add(ans);
    //        }
    //        else{
    //         hashing.add(arr[j]);
    //        }
    //     }
    //     hashing.clear();
    //  }
    //  return set;
    // }

     public static List<List<Integer>> sum3(int arr[])
     { 
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
             if(i!=0&&arr[i]==arr[i-1]){
                continue;
            }
            int j=i+1;
            int k=arr.length-1;
           while(j<k){
            int sum=arr[i]+arr[j]+arr[k];
            if(sum<0) j++;
            else if(sum>0) k--;
            else {
                List<Integer> list=new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[j]);
                list.add(arr[k]);
                ans.add(list);
                j++;
                k--;
             while(j<k&&arr[j]==arr[j-1])j++;
            while(j<k&&arr[k]==arr[k+1])k--;
            }
            
           }

        }
        return ans;        
        
    
     }
    
    
}
