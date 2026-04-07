public class ex_throw {
    public static void main(String[] args)
    {
        int age=15;
        if(age<18)
        {
            throw new ArithmeticException("you are not eligible to vote");
        }
        System.out.println("you can vote");
    }

    
}
