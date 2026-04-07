import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class index_get {
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<>();
           list.add("kavya");
           list.add("nikki");
           list.add("puji");
           System.out.println("First element:"+list.get(0));
            System.out.println("second element:"+list.get(1));
            list.remove(1);
             System.out.println("elements after removal:");
             for(String name:list)
             {
                System.out.println(name);
             }


    }
    
}
