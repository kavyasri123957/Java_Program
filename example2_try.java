public class example2_try {
    public static void main(String[] args)

    
    {
        try {
            int[] arr={2,4,5};
        System.out.println("element at the index"+arr[3]);        

    } 
    catch (ArrayIndexOutOfBoundsException e)
    {
 System.out.println("ArrayIndexOutOfBoundsException occured"+e.getMessage());  
    }
    
}
}

