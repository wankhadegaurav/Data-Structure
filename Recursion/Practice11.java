public class Practice11 {

    public static void main(String args[])
    {
       Practice11 pra=new Practice11();
      
       pra.print(10);

    }
    public void   print(int index){
          if(index<1){
            return ;
          }
  System.out.println(index);
        print(index-1);
    }

    
    
}
