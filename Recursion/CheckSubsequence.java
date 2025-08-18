public class CheckSubsequence {

    public static void main(String args[])
    {

        String s="aaa";
        String t="adbgdc";
        System.out.println(function(s, t, 0, 0));

    }

    public static boolean function(String s,String t,int sindex, int tindex)
 {
    if(sindex==s.length()) return true;
    if(tindex==t.length()) return false;

      if(s.charAt(sindex)==t.charAt(tindex)){
        return function(s,t,sindex+1,tindex+1);
      }
      else{
        return function(s,t,sindex,tindex+1);
      }
      
 }   
}
