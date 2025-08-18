import java.util.*;
public class NQueen
{
    // brut force code 
    
    public static void main(String[] args)
    {
        int n=4;
      List<List<String>> list=new ArrayList<>();
      char board[][]=new char[n][n];
      
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
        {
            board[i][j]='.';
        }
      }
         NQueen(0,board,list);
   
         for(List<String>s:list){
          System.out.print(" "+s);
         }


    }

    public static void NQueen(int col,char board[][],List<List<String>> list)
    {
       if(col==board.length){
        List<String> ds=new ArrayList<>();
          for(int i=0;i<board.length;i++){
            ds.add(new String(board[i]));
          }
          list.add(new ArrayList<>(ds));
          return ;
       }
       for(int row=0;row<board.length;row++){
        if(validate(board,row,col)){
            board[row][col]='Q';
            NQueen(col+1,board,list);
            board[row][col]='.';
        }
       }
    }
    public static boolean validate(char board[][],int row,int col)
    {
       int dprow=row;
       int dpcol=col;
       
       while(col>=0&&row>=0)
       {
          if(board[row][col]=='Q') return false;
          row--;
          col--;
       }
       row=dprow;
       col=dpcol;
       while(col>=0){
        if(board[row][col]=='Q') return false;
        col--;
       }

       row=dprow;
       col=dpcol;
       while(col>=0&&row<board.length)
       {
         if(board[row][col]=='Q') return false;
         col--;
         row++;
       }
       return true;
    }

    
}
