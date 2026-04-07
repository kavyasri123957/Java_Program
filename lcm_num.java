import java.util.Scanner;
public class lcm_num {
      static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcdvalue=gcd(a,b);
        int lcm=(a*b)/gcdvalue;
        System.out.println("lcm="+lcm);
    }
}
