import java.util.ArrayList;
import java.util.List;

public class Pascel{
    public static void main(String args[])
    {
      List<List<Integer>> list=printPascelTriangle(6);
      for(List<Integer> l:list){
        System.out.println(l);
      }
      
    }

  // for printing the singlement from the pascel triangle
    public static int singleElement(int row,int col)
    {
        int n=row-1;
        int c=col-1;
        int ans=1;
        for(int i=0;i<c;i++)
        {
            ans=ans*(n-i);
            ans=ans/(i+1);
        }
        return ans;
    }


    //  printing the single row for the row number
    // public static void singleRowElement(int row)
    // {
    //     ;
    //     for(int i=1;i<=row;i++)
    //     {
    //      System.out.print(singleElement(row, i)+" ");

    //     }
    // }

      public static List<List<Integer>>  printPascelTriangle(int row)
      {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=row;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=1;j<=i;j++)
            {   
               list.add(singleElement(i, j));
            }
            ans.add(list);
        }
        return ans;
        

      }




}