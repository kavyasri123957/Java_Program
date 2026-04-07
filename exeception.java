public class exeception {
    public static void main(String[] args)
    {
        try {
            int result=10/0;
            System.out.println("result"+result);
 ;
       }
       catch(ArithmeticException e)
       {
        System.out.println("arithmetic exception occured"+e.getMessage());
       }
    }
    
}
