import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principle");
        int p=sc.nextInt();
            System.out.println("enter the time");
            int t=sc.nextInt();
                System.out.println("enter the time");
                float r=sc.nextFloat();
            double si=(p*t*r)/100;
            System.out.println("simple interest:"+si);
    }
    
}
