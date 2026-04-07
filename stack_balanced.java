import java.util.Scanner;
import java.util.Stack;
public class stack_balanced {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter expression:"); 
    String expr=sc.nextLine();
Stack<Character>stack=new Stack<>();
boolean balanced=true;
for(char ch:expr.toCharArray())  
{
    if(ch=='('||ch== '{'||ch=='[')
    {
        stack.push(ch);

    }else if(ch==')'||ch=='}'||ch==']')
    {
        if(stack.isEmpty())
        {
            balanced=false;
            break;
        }
        char top=stack.pop();
        if((ch==')'&&top!='(')||(ch=='}'&&top!='{'||(ch=='['&&ch==']'))){
            balanced=false;
            break;
        }
    }
    if(!stack.isEmpty()) 
        balanced=false;
    System.out.println("Balanced:"+balanced);
    }
} }
    
