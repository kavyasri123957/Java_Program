import java.util.Scanner;
@FunctionalInterface
interface ReverseString
{
    String reverse(String s);
}
class REVERSELAMDA
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string:");
        String str=sc.nextLine();
        ReverseString r=(s)->new StringBuilder(s).reverse().toString();
        System.out.println("reversed string: "+r.reverse(str));

    }
}
