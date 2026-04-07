public class exception_handling {
    public static void main(String[] args)
    
    {
        try{
            int arr[]={10,20,30,40};
            System.out.println("array index:"+arr[5]);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index out of bounds :");
        }
        try{
            int num=Integer.parseInt("abc");
            System.out.println("number :"+num);
            

        }
        catch(NumberFormatException e)

     {
        System.out.println("invalid number format");

        }
        System.out.println("program continues after exception handling");
        }
    
    }
    

