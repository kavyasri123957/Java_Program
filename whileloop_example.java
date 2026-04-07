import java.util.Scanner;
public class whileloop_example {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        while(n>=1)
        {
            System.out.println(n);
            n--;
        }
    }
    
}
