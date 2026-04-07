import java.util.*;
public class stack_ {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        stack.push(10);
         stack.push(20);
          stack.push(30);
          System.out.println("Top:"+stack.peek());
           System.out.println("popped"+stack.pop());
            System.out.println("newtop"+stack.peek());



    }
    
}
