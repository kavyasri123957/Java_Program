import java.util.Scanner;
@FunctionalInterface
interface StringLength
{
    int getLength(String s);
}
class LENGTHLAMDA
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string:");
        String str=sc.nextLine();
        StringLength len=(s)->s.length();
        System.out.println("length of string: "+len.getLength(str));
    }
}
