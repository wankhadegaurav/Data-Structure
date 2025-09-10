public class StringPalindrom
{
    public static void main(String[] args) 
    {
        
       // System.out.println(palindrom("NayaN"));
        System.out.println(palindrom("Nilesh"));
        
    }
    public static boolean palindrom(String str)
    {
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;

    }

}