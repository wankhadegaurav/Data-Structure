public class Trionic{
    public static void main(String[] args)
    {
        int arr[]={1,3,5,4,2,6};
        System.out.println(trionic(arr));
    }
    public static boolean trionic(int arr[])
    {
        int p=0;
        for(int i=1;i<arr.length;i++)
        {
                if(arr[i-1]<arr[i]){
                    continue;
                }
                else{
                    p=arr[i-1];
                    System.out.println(p);
                    break;
                }
        }

        return true;

    }
}