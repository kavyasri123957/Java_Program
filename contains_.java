import java.util.ArrayList;
public class contains_ {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
         list.add(20);
          list.add(30);
           list.add(40);
           if(list.contains(30))
           {
            System.out.println("30 is present");
           }else{
            System.out.println("not present");
           }
        
           list.add(2,25);
           System.out.println("element is added after adding 25 at index 2");
           for(int i=0;i<list.size();i++)
           {
            System.out.println(list.get(i));
           }
           if(list.isEmpty())
           {
            System.out.println("array list is empty");
           }else{
            System.out.println("array list is not  empty");
           }
    }
    
}
