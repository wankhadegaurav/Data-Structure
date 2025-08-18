public class LongComSequence {
    public static void main(String args[])
    {
        String s="XYZAB";
        String t="AXYZB";
        System.out.println(longString(s, t,0,0));

    }

    
    public static int  longString(String s,String t, int i ,int j)
    {
        if(i==s.length()||j==t.length()){
            return 0;
        }
        if(s.charAt(i)==t.charAt(j))
        {
            
            return 1+longString(s, t, i+1, j+1);

        }
        else{

           return Math.max(longString(s, t, i+1, j),longString(s, t, i, j+1));
        }
        

    }
    
    
    
}
