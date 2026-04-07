import java.util.Queue;
import java.util.LinkedList;
public class queue_ex {
    public static void main(String[] args)
    {
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
         q.offer(20);
          q.offer(30);
           q.add(40);
           System.out.println(q);
           q.remove();
            System.out.println(q.peek());
            System.out.println(q);


        


    }
    
}
