import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sprialMatrix 
{
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

      List<Integer> list=sprialMatrix(matrix);
      for(Integer i:list)
      {
        System.out.print(i+" ");

      }
        
    }
    // neede to  be solved 
        
    public static List<Integer> sprialMatrix(int arr[][])
    {
        List<Integer> list=new ArrayList<>();

        int left=0;
        int right=arr[0].length-1;
        int top=0;
        int bottom=arr.length-1;
    
        while(top<=bottom &&left<right)
        {
            for(int col=left;col<=right;col++){
                list.add(arr[top][col]);
            }
            top++;
            for(int row=top;row<bottom;row++){
                list.add(arr[row][right]);
            }
            right--;

            if(top<=bottom){
                for(int col=right;col>=left;col--){
                list.add(arr[top][col]);
            }
            bottom--;
            }
            if(left<right){
                
            }

return list;
        }

       
    }
    

