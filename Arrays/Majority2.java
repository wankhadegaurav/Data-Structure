import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority2{
    public static void main(String args[]){
       int arr[]={2,1,1,3,1,1,3,3,3};

       List<Integer> list=Majority2(arr);
       for(int i:list){
        System.out.println(i);
       }
    }
    // IT is an optimal way to get the majority element;
    // public static List<Integer> Majority2(int arr[])
    // {
    //     List<Integer> list=new ArrayList<>();
    //     int count1=0;
    //     int count2=0;
    //     int element1=Integer.MAX_VALUE;
    //     int element2=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++)
    //     {
          
    //         if(count1==0&&element2!=arr[i]){
    //             count1=1;
    //             element1=arr[i];
    //         }
    //         else if(count2==0&&element1!=arr[i]){
    //             count2=1;
    //             element2=arr[i];
    //         }
    //         else if(element1==arr[i])count1++;
    //         else if(element2==arr[i])count2++;
    //         else{
    //             count1--;
    //             count2--;
    //         }

    //     }
            
    //     count1=0;
    //     count2=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==element1)count1++;
    //         if(arr[i]==element2)count2++;
            
    //     }
    //     if(count1>arr.length/3) list.add(element1);
    //     if(count2>arr.length/3)list.add(element2);

    //     return list;
        
    // }


    // better approach for it 
    // public static List<Integer> Majority2(int arr[]) 
    // {
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     List<Integer> list=new ArrayList();
    //     for(int i=0;i<arr.length;i++)
    //     {
            
           
    //         map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    //          if(map.get(arr[i])>arr.length/3&&!list.contains(arr[i])){
    //             list.add(arr[i]);
    //         }

    //     }
    //     return list;

    // }


   // brute force approach
    public static List<Integer> Majority2(int arr[])
    {
        int count=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int number=arr[i];
            for(int j=0;j<arr.length;j++){
                if(number==arr[j]) count++;
                else if(count>arr.length/3&& !list.contains(number)) list.add(number);
            }
        }
        return list;
         
    }





}