public class First
{
    public static void main(String[] args) 
    {
        String haystack="sadbura";
        String needle="sad";
         System.out.println(first(haystack,needle));
        
    }
    public static  int first(String haystack,String needle){
        int index=-1;
        int left=0;
        int right=0;
        while(left<haystack.length())
        {
            if(haystack.charAt(left)==needle.charAt(right)){
                left++;
                right++;

                if(right==needle.length()){
                index=left-right;
                break;
            }
        }
            else{
                left=left-right+1;
                right=0;
            }
            }
        
        return index;
    }
    
}