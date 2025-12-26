import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses
{
    public static void main(String args[])
    {
        String str="{[(]})}";
        System.out.println("validParanthese :"+validParanthese(str));
       
    }

    // public static boolean validParanthese(String str)
    // {
    //     HashMap<Character,Character> map=new HashMap<>();
    //     map.put('{','}');
    //     map.put('(',')');
    //     map.put('[',']');
    //     Stack<Character> stack=new Stack();
    //      int left=0;
    //      while(left<str.length())
    //     {
    //         if(map.containsKey(str.charAt(left)))
    //         {
    //             stack.push(str.charAt(left));
    //         }
    //         else{
    //                if(!stack.isEmpty()){
    //                  stack.pop();
    //                }
    //                else{
    //                 return false;
    //                }
    //             }    
    //      left++;
    // }
    //  if(stack.isEmpty()){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }


               public static boolean validParanthese(String str)
               {
                 Stack stack=new Stack<>();
                 for(char c:str.toCharArray()){
                    if(c=='(') stack.push(")");
                    else if(c=='{') stack.push('}');
                    else if(c=='[') stack.push(']');
                    else {
                        if(!stack.isEmpty()||(Character)stack.pop()!=c)
                            {
                                return false;
                        }
                    }
                 }   
                 return true;
               }

   

  

   


}

           

