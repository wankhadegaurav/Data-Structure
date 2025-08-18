public class StringPalindrom {
    public static void main(String args[]){
        String name="MADAM";
        int first=0;
        Boolean value =function(name, first);
        System.out.println(value);
        

    }
public static boolean function(String  name,int first){
    if(first>=name.length()/2) return true;
    if(name.charAt(first)!=name.charAt(name.length()-1-first)){
        return false;
    }

    return function(name, first+1);
    
}
    
}
