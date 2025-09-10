public class DuplicateString 
{
    public static void main(String args[])
    {
        String duplicate="programming";
        System.out.println(removeDuplicate(duplicate));
       
    }
    public static String removeDuplicate(String str)
    {
       boolean seen[]=new boolean[26];
       StringBuilder builder =new StringBuilder();
       for(int i=0;i<str.length();i++)
       {
        char ch=str.charAt(i);
        int value=ch-'a';
        if(!seen[value])
        {
            builder.append(ch);
            seen[value]=true;

        }
       }
       return builder.toString();
    }
    
}
