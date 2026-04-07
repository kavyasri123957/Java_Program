import java.util.*;
public class count {
    static int countdigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return 1+countdigits(n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println("nuber of digitd is 1");
        }
        else{
            System.out.println("nuber of digitd is: "+countdigits(n));

        }

        }
    }
    
