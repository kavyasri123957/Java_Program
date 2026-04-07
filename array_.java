import java.util.*;
public class array_ {
    public static void main(String[] args)
    {
        Deque<String> dq=new ArrayDeque<>();
        dq.addFirst("A");
        dq.addLast("B");
        dq.addLast("C");
        System.out.println("Deque:" +dq);
        dq.removeFirst();
        System.out.println("After remove first:"+dq);
        dq.removeLast();
        System.out.println("after removing last:"+dq);
        dq.addFirst("X");
        dq.addFirst("Y");
        System.out.println("final deque:"+dq);


    }
    
}
