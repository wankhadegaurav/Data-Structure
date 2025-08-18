import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args){
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        function(n);
        
    }
    public static void function(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=(2*i+1);j++){
                System.out.print(i);
            }
            for(int j=0;j<n-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    
}
