import java.util.Scanner;
public class even_num_range {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range");
        int n=sc.nextInt();
         System.out.print("even numbers between the range");
        for (int i=2;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

    }
    
}
