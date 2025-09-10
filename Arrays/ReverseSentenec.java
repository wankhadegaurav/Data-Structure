public class ReverseSentenec 
{
    public static void main(String args[])
    {
     
        String sentence="Irise institute is the best institute ";

        System.out.println(reverse(sentence));
    }
    public static String reverse(String str)
    {
        StringBuilder builder=new StringBuilder();
        int breakpoint=str.length();
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' ')
            {
                builder.append(str.substring(i+1, breakpoint));
                builder.append(" ");
                breakpoint=i;
            }
            
        }
        builder.append(str.substring(0, breakpoint));
        return builder.toString();
    }
    
}
