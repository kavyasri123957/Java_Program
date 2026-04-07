import java.util.Scanner;
public class nth_fibonacci {
    public static void main(String[] args){
    int n,a=0,b=1,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the nth fibonacci u want :");
    n=sc.nextInt();
    for (int i=1;i<=n;i++){
        c=a+b;
        a=b;
        b=c;
    }
    System.out.println("the number is:"+a);

    
}
}
