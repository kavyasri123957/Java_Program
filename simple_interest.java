import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principlal");
        Double p=sc.nextDouble();
         System.out.println("enter the rate");
        Double r=sc.nextDouble();
         System.out.println("enter the time");
        Double t=sc.nextDouble();
        Double si= si=(p*t*r)/100;
        System.out.println("simple intersest ="+si);

    }
}
