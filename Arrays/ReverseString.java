public class ReverseString{
    public static void main(String args[])
    {
        
        String hello="HELLO";
        System.out.println(reverse(hello));
        
        
    }
    public static String reverse(String str)
    {
       char ch[]=str.toCharArray();
       int left=0;
       int right=str.length()-1;
       while(left<=right)
       {
        char c=ch[left];
        ch[left]=ch[right];
        ch[right]=c;
        left++;
        right--;
       }
       return new String(ch);
        
    }
}