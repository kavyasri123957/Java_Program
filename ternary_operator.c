import java.util.Scanner;
public class ternary_operator{
    public static void main(String[] args)
{
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.newInt();
        String s=a%2==0?"even":"odd";
        System.out.println("a is"+s);
}
}