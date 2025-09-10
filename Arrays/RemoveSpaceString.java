import java.util.ArrayList;

public class RemoveSpaceString 
{
    public static void main(String args[]){
       String space="java programming";
          System.out.println(removeSpace(space));
    }
    // public static String removeSpace(String str)
    // {
    //     char ch[]=str.toCharArray();
    //     int breakpoint=-1;
    //     for(int i=0;i<ch.length;i++)
    //     {
    //         if(ch[i]==' '){
    //             breakpoint=i;
    //             break;
    //         }

    //     }
    //     for(int i=breakpoint+1;i<ch.length;i++){
    //         ch[breakpoint]=ch[i];
    //         breakpoint+=1;
    //     }
    //     return new String(ch,0,ch.length-1);
 
    // }

    public static String removeSpace(String str)
    {
       StringBuilder builder =new StringBuilder();
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)!=' '){
            builder.append(str.charAt(i));
        }
       }
       return builder.toString();
    }
    
    
}
