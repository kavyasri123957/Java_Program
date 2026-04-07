import java.util.Scanner;
@FunctionalInterface   //optional
interface EvenOdd
{
    void check(int n);
}
class EVENODDLAMDA
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        EvenOdd e=(n)->
        {
            if(n%2==0)
            System.out.println(n+"is Even");
            else
            System.out.println(n+"is Odd");
        };
        e.check(num);
    }
}
