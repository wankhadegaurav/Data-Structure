public class PrimeIndex 
{
    public static void main(String args[])
    {
       int arr[]={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
       int sum=0;
       for(int i=0;i<arr.length;i++){
        if(checkPrime(i, arr)){
            sum+=arr[i];
        }
       }
       System.out.println(sum);
    }
    public static boolean checkPrime(int number,int arr[])
    {
        int count=0;
        for(int i=1;i*i<=number;i++){
            if(number%i==0){
                count++;
                if(number/i!=i){
                    count++;
                }
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }

    }
    
}
