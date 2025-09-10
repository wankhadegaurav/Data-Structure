import java.util.ArrayList;
import java.util.HashMap;

public class StringAnagram 
{
    public static void main(String args[])
    {
        String str1="listjen";
        String str2="silent";
        System.out.println(Anagram(str1, str2));

    }

  
    
    // Hashmap brute force appoach for  it 
//    public static boolean Anagram (String str1,String str2)
//    {
//       HashMap<Character,Integer> map1=new HashMap<>();
//       if(str1.length()!=str2.length()) return false;
//       for(int i=0;i<str1.length();i++)
//       {
//         map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
//       }
//       for(int i=0;i<str2.length();i++)
//       { 
//         if(map1.containsKey(str2.charAt(i))&&map1.get(str2.charAt(i))>0)
//         {
//             map1.put(str2.charAt(i),map1.get(str2.charAt(i))-1);

//         }
//         else{
//             return false;
//         }

//       }
//       return true;
//    }




// optimal approach for it using the char array for the valid anagram Tc  O(n) time and Sc O(n)
    public static boolean Anagram(String str1,String str2)
    {
      int arr[]=new int[26];
      if(str1.length()!=str2.length()) return false;
      
      for(int i=0;i<str1.length();i++)
      {
             int value=str1.toLowerCase().charAt(i)-'a';
             arr[value]+=1;
      }       
  
      for(int i=0;i<str2.length();i++)
      {
            int value=str2.toLowerCase().charAt(i)-'a';
            if(arr[value]==0)
            {
               return false;
            }
            arr[value]-=1;
      }
      
      return true;
      
       



    }




}
