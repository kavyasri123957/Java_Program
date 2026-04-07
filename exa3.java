public class exa3 {
    public static void main(String[] args)
    {
        try{
            int result=10/0;
            System.out.println("result:"+result);//this line will not execute
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException  occured"+e.getMessage());

        }
        catch(ArrayIndexOutOfBoundsException e)
        {

             System.out.println("array index out of bounds "+e.getMessage());
        }
        catch(NullPointerException e)
        {
            System.out.println("null pointer exception occured"+e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("exception occured "+e.getMessage());
        }

        }
    } 

