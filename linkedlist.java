import java.util.LinkedList;
import java.util.Scanner;
public class linkedlist {
    public static void main(String[] args)
    {
        LinkedList<String> list=new LinkedList<>();
        list.add("green");
        list.add("yellow");
        list.add("red");
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the string to check:");

        String s=sc.nextLine();
        if(list.contains(s))
        {
            System.out.println("string is found");
        }else{
            System.out.println("not found:");
        }


    }
    
}
