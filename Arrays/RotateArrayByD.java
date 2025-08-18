import java.util.Scanner;

public class RotateArrayByD
{
    public static void main(String[] args)
    {
        System.out.println("enter the value  of array");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [7];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        rotate(arr, 3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void rotate(int arr[],int d)
    {
     int temp[]=new int[d];
     int n=arr.length;
        for(int i=0;i<d;i++)
        {
         temp[i]=arr[i];

        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
    }
    
}