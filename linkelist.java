import java.util.LinkedList;
public class linkelist {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();
    list.add("nikki");
    list.add("kavya");
     list.add("puji");
     System.out.println("linkedlist elements");
     for(String name:list)
     {
        System.out.println(name);

     }
     list.addFirst("bindhu");
      list.addLast("gopi");
      System.out.println("linked list after");
    
for(String name:list)
     {
        System.out.println(name);

     }
list.removeFirst();
list.removeLast();
for(String name:list)
     {
        System.out.println(name);

     

    }
}
}
