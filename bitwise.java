import java.util.Scanner;
public class bitwise {
    public static void main(String[] args)
    {
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("enter the b2 numbers");
a=s.nextInt();
b=s.nextInt();
System.out.println("AND="+(a&b));
System.out.println("OR="+(a|b));
System.out.println("XOR"+(a^b));
System.out.println("left shift="+(a<<1));
System.out.println("righr shift="+(a>>2));
}
}
