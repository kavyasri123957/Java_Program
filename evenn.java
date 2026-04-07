import java.util.Scanner;
public class evenn{
    public static void main(String[] args)
{
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        String s=a%2==0?"even":"odd";
        System.out.println("a is"+s);
}
}
    
