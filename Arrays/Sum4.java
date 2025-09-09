import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum4{
    public static void main(String[] args) 
    {
        int arr[]={1,0,-1,0,-2,2};
        int target=0;
        // Set<List<Integer>> set=sum4(arr, target);
        // for(List<Integer> list:set){
        //   System.out.println(list);
        // }


        List<List<Integer>> list=sum4(arr, target);
        for(List<Integer> li:list){
          System.out.print(li);
        }
    }
    // brute force approach for sum4 tc =(O4) Sc=O(n);
    // public static Set<List<Integer>> sum4(int arr[],int target)
    // {
    //   HashSet<List<Integer>> set=new HashSet<>();
    //   for(int i=0;i<arr.length;i++){
    //     for(int j=i+1;j<arr.length;j++){
    //       for(int k=j+1;k<arr.length;k++){
    //         for(int l=k+1;l<arr.length;l++){
    //           long sum=(long)arr[i]+arr[j];
    //           sum+=arr[k];
    //           sum+=arr[j];
              
    //           if(sum==target){
    //             List<Integer> list=new ArrayList<>();
    //             list.add(arr[i]);
    //             list.add(arr[j]);
    //             list.add(arr[k]);
    //             list.add(arr[l]);
    //             Collections.sort(list);
    //             set.add(list);
    //           }
    //         }
    //       }
    //     }
    //   }
    //   return set;

    // }



    // better approach for sum4 
    // public static Set<List<Integer>> sum4(int arr[],int target)
    // {
    //   List<Integer> hashing=new ArrayList<>();
    //   Set<List<Integer>> set=new HashSet<>();
    //   for(int i=0;i<arr.length;i++)
    //   {
    //     for(int j=i+1;j<arr.length;j++)
    //     {
    //       for(int k=j+1;k<arr.length;k++)
    //       {
    //         int sum=target-(arr[i]+arr[j]+arr[k]);
    //         if(hashing.contains(sum)){
    //           List<Integer> list=new ArrayList<>();
    //           list.add(arr[i]);
    //           list.add(arr[j]);
    //           list.add(arr[k]);
    //           list.add(sum);
    //           Collections.sort(list);
    //           set.add(list);
    //         }
    //         hashing.add(arr[k]);
    //       }
    //     }
        

    //   }
    //   return set;

    // }


    // optimal approach for the sum4 without using the hashset
    public static List<List<Integer>> sum4(int arr[],int target)
    {
      Arrays.sort(arr);
      List<List<Integer>> ans=new ArrayList<>();
      for(int i=0;i<arr.length;i++)
      {
        if(i!=0&&arr[i]==arr[i-1]) continue;
        for(int j=i+1;j<arr.length;j++)
        {
          int k=j+1;
          int l=arr.length-1;

          if(j>i+1&&arr[j]==arr[j-1]) continue;
          while(k<l)
          {
            long sum=arr[i]+arr[j];
            sum+=arr[k]+arr[l];
            if(sum==target)
            {
              List<Integer> list=new ArrayList<>();
              list.add(arr[i]);
              list.add(arr[j]);
              list.add(arr[k]);
              list.add(arr[l]);
              ans.add(list);
              k++;
              l--;
              while(k<l&&arr[k]==arr[k-1]) k++;
              while(k<l&&arr[l]==arr[l+1]) l++;

            }
            else if(sum<target) k++;
            else l--;
          }

        }

      }
      return ans;
      

    }
    



    }
    
   
