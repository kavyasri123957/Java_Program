import java.util.Scanner;
@FunctionalInterface
interface Maxnumber
{
    int max(int a,int b);
}
class MAXLAMDA
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int x=sc.nextInt();
        System.out.print("Enter second number:");
        int y=sc.nextInt();
        Maxnumber m=(a,b)->(a>b)?a:b;
        System.out.println("Maximum number is: "+m.max(x,y));
    }
}
