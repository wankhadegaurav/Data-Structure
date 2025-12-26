public class NthRootQuestion 
{
    public static void main(String args[])
    {
        System.out.println(nrootOfQuestion(3, 27));
    }

    public static long nrootOfQuestion(int n,int m)
    {
        long low=1;
        long high=m;
        while(low<=high)
        {
            long mid=(low+high)/2;

            long ans=1;
            for(int i=0;i<n;i++){
                ans*=mid;
                if(ans>m)break;
            }

            if(ans==m){
                return mid;
            }
            else if(ans<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    
}
