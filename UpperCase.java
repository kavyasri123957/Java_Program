import java.util.Scanner;
@FunctionalInterface
interface UpperCase
{
    String convert(String s);
}
class UPPERCASELAMDA
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string:");
        String str=sc.nextLine();
        UpperCase u=(s)->s.toUpperCase();
        System.out.println("UpperCase String: "+u.convert(str));
    }
}