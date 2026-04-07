import java.util.Scanner;
public class swap_without_temporary {
    public static void main(String[] args){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the a value:");
    a=sc.nextInt();
    System.out.println("enter the second number:");
    b=sc.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a value after swapping:"+a);
    System.out.println("b value after swapping:"+b);
    
}
}