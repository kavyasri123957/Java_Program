import java.util.Scanner;
public class Prime{
    public static void main(String[] args)
    {
        int num,flag=0,i=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        num=sc.nextInt();
        if(num<=1)
        {
            System.out.println("it is not a prime :");
        }
        for(i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("it is a prime number:");
        }
        else{
            System.out.println("not a prime number :");
        }


    }
}