import java.util.Scanner;

public class RotateMatrix{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of rows");
       int row=sc.nextInt();
       System.out.println("enter the col");
       int col=sc.nextInt();

       int matrix[][]=new int[row][col];

       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.println("enter the value of n");
            matrix[i][j]=sc.nextInt();
        }
       }

       int arr[][]=rotateMatrix(matrix);
       System.out.println("output of martix");
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
       
    }
    // as it take the complexity of o(n2) time 
    // public static int[][] rotateMatrix(int matrix[][])
    // {
    //     int row=matrix.length;
    //     int col=matrix[0].length;
    //     int arr[][]=new int[row][col];

    //     for(int i=0;i<row;i++)
    //     {
    //         for(int j=0;j<col;j++)
    //         {
    //             arr[j][matrix.length-1-i]=matrix[i][j];
    //         }
    //     }
    //         return arr;
    // }

    public static int [][] rotateMatrix(int matrix[][])
    {
       for(int i=0;i<=matrix.length-2;i++)
       {
        for(int j=i+1;j<matrix[i].length;j++)
        {
            int temp=0; 
             temp=matrix[j][i];
            matrix[j][i]=matrix[i][j];
            matrix[i][j]=temp;
        }

       }
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length/2;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[i][matrix[i].length-1-j];
            matrix[i][matrix[i].length-1-j]=temp;
        }
       }
       return matrix;

    }
   
}