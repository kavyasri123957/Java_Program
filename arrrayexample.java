import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public  class arrrayexample{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
    list.add(10);
     list.add(20);
     list.add(30);
     list.add(40);
      list.add(50);
      System.out.println("first element"+list.get(0));
       System.out.println("second element"+list.get(1));
       list.remove(2);
       System.out.println("elements after removing");
    
    System.out.println("get the size"+list.size());
    System.out.println("after update the list"+list.isEmpty());

    }

   }

