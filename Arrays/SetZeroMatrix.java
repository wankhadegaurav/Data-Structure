import java.util.ArrayList;
import java.util.Arrays;

public class SetZeroMatrix 
{
    public static void main(String args[])
    {

       ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
       matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
       matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
       matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
       
       ArrayList<ArrayList<Integer>> ans=setMatrixZero(matrix, matrix.size(), matrix.get(0).size());

       for(ArrayList<Integer> list:ans)
       {
          System.out.print(list+" ");
       }

    
    }
    // It is better approach for the set the matrix zero
    // public static ArrayList<ArrayList<Integer>> setZeroMatrix(ArrayList<ArrayList<Integer>> ans,int n,int m)
    // {
    //   int row[]=new int[n];
    //   int col[]=new int[m];
    //    for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++)
    //     {
    //         if(ans.get(i).get(j)==0)
    //         { 
    //             row[i]=1;
    //             col[j]=1;

    //         }
    //     }
    //    }
    //    for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         if(row[i]==1||col[j]==1){
    //             ans.get(i).set(j, 0);
    //         }
    //     }
    //    }
    //    return ans;
    // }

    public static ArrayList<ArrayList<Integer>> setMatrixZero(ArrayList<ArrayList<Integer>> ans,int n,int m)
    {
        // matrix[0][...]
        //matrix[..][0]
        int col=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                    if(ans.get(i).get(j)==0)
                    {
                        ans.get(0).set(0,0);
                        if(j!=0)
                        {
                            ans.get(i).set(j,0);
                        }

                        else{
                            col=0;
                        }
                    }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++)
            {
                if(ans.get(i).get(j)!=0)
                {
                    if(ans.get(0).get(j)==0||ans.get(i).get(0)==0)
                    {
                        ans.get(i).set(j,0);

                    }
                }
            }
        }

        if(ans.get(0).get(0)==0){
           for(int j=0;j<m;j++){
            ans.get(0).set(j,0);
           }
        }
        if(col==0){
            for(int i=0;i<n;i++){
                ans.get(i).set(0,0);
            }
        }
        return ans;

    }


    
}
