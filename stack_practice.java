import java.util.Scanner;
public class stack_practice {
    int max=100;
    int top=-1;
    int[] stack=new int[max];
void push(int data)
{
    if(top>=max-1)
    {
        System.out.println("stack is overflow");
    }
    else{
        stack[++top]=data;
    }
}
void pop()
{
    if(top<0)
    {
        System.out.println("stack underflow");

    }
    else{
        System.out.println(stack[top--]);
    }
}
void display()
{
    for(int i=top;i>=0;i--)
    {
        System.out.println("stack elements are:"+stack[i]);
    }
}
public static void main(String[] args)
{
    stack_practice s=new stack_practice();
    s.push(10);
    s.push(20);
    s.display();
    s.pop();
    s.display();
}
}

