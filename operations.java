
import java.util.Scanner;
public class operations {
    public static void main(String[] args)
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("enter 2 numbers ");
      a=s.nextInt();  
        b=s.nextInt();  
        System.out.println("add="+(a+b));
        System.out.println("sub="+(a-b));
        System.out.println("mul="+(a*b));
        System.out.println("div="+(a/b));
        System.out.println("mod="+(a%b));

    }
}