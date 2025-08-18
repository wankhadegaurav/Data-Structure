import java.util.Scanner;

public class Practice6 {
    static int count=0;
    public static void main(String args[])
    {
        System.out.println("enter the value of N");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
   // function1(4, 4, 1);
//   System.out.println(function1(2,3));
   
//System.out.println(function2(3));
//    System.out.println(function3(n,n));
// System.out.println(function4(100,25));
//System.out.println(function7(n,0));
  System.out.println(function8(n, 0));

    }
//     public static void function1(int a,int b,int value)
//     {
//    if(count==b){
//     System.out.println(value);
//     return ;
//    }
//    count++;
//    function1(a,b,a*value);     
//     }

// public static int function1(int a,int b){
//     if(count==b) return 1 ;
//     count++;
//     return a*function1(a,b);

// }

// public static int function2(int n){
//     if(n==0) return 0;
//     if(n==1) return 1;
//     return function2(n-1)+function2(n-2);
// }

// static int reverse=0;
//     public static boolean function3(int n,int duplicate ){
//         if(n>0){
//             int last=n%10;
//             reverse=(reverse*10)+last;
//         }
//         if(n==0){
//             if(reverse==duplicate){
//                 return true;
//             }
//             else{
//                 return false;
//             }          
//         }
//          return function3(n/10,duplicate);
//     }

//   public static int function4(int a,int b){
//      if(a==0) return b;
//      if(b==0) return a;
//      return function4(a%b, b%a);
//   }
 

// public static int function7(int n,int count){ 
//     if(n>0){
//         count++;
//     }
//     if(n==0){
//         return count;
//     }
//     return function7(n/10,count);
// }
  

public static int function8(int n,int reverse){
    if(n>0){
        int last=n%10;
        reverse=(reverse*10)+last;
    }
    if(n==0){
        return reverse;
    }
    return function8(n/10, reverse);

}


    
}
