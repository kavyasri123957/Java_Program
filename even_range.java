import java.util.Scanner;
public class even_range {
    public static void main(String[] args){
    int i=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("the numbers between the range ");
    for(i=0;i<=n;i=i+2)
    {
        System.out.println(i);
    }
    }
    
}
