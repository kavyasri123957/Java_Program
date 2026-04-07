import java.util.Scanner;
import java.util.Stack;
public class reversestring {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String str=sc.nextLine();
Stack<Character> stack=new Stack<>();
for(char c : str.toCharArray()) stack.push(c);
System.out.println("reversed string");
while(!stack.isEmpty())
System.out.print(stack.pop());
    }
    
}
