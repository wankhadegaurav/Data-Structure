

public class SprialMatrix2 
{
    public static void main(String args[])
    {
        int arr[][]=sprialMatrixtwo(5);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       
    }
    public static int[][] sprialMatrixtwo(int n)
    {
        int nums[][]=new int[n][n];
        int left=0;
        int right=nums[0].length-1;
        int bottom=nums.length-1;
        int top=0;
        int count=1;
        while(left<=right&&top<=bottom)
        {
            for(int i=left;i<=right;i++){
                nums[top][i]=count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                nums[i][right]=count++;
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    nums[bottom][i]=count++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    nums[i][left]=count++;
                }
                left++;
            }

        }
        return nums;

    }

    
}
