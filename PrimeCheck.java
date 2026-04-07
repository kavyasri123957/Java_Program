import java.util.Scanner;
@FunctionalInterface
interface PrimeCheck
{
    boolean isPrime(int n);
}
class PRIMENUMLAMDA
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        PrimeCheck p=(n)->
        {
            if(n<=1)
            {
                return false;
            }
        
        
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
        };
        if(p.isPrime(num))
        System.out.println(num+"is prime");
        else
        System.out.println(num+"not prime");
    }
}