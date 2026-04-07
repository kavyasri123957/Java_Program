import java.util.LinkedList;
public class linkelistex {
    public static void main(String[] args)
    {
        LinkedList<String> queue=new LinkedList<>();
        queue.offer("order1");
         queue.offer("order2");
          queue.offer("order3");
          System.out.println("queue :"+queue);
           System.out.println("queue :"+queue.poll());
            System.out.println("updated queue :"+queue);
    }
    
}
