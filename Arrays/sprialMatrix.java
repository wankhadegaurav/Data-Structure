import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sprialMatrix{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row");
        int row=sc.nextInt();
        System.out.println("enter the number of Columns");
        int col=sc.nextInt();

        int matrix[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                System.out.println("enter value");
                matrix[i][j]=sc.nextInt();
            }
        }

        List<Integer> list =matrix(matrix);
        for(int l:list){
            System.out.println(l);
        }
        
        
    
    }

    public static List<Integer> matrix(int matrix[][])
    {
        
       
        List<Integer> list=new ArrayList<>();
      int left=0;
      int right=matrix[0].length-1;
      int top=0;
      int bottom=matrix.length-1;

           while(left<=right&&top<=bottom)
           {
             for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
          if(top<=bottom){
              for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
          }

           if(left<=right){
             for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
           

           }

           }


        
        return list;

    }
}