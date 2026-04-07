public class error_ex {
    public static void main(String[] args)
    {
        try{
        String str=null;
        System.out.println("length of the string is :"+str.length());
        }
        catch(NullPointerException  e)
        {
            System.out.println("NullPointerException occured:"+e.getMessage());
        }
    }
    
}
