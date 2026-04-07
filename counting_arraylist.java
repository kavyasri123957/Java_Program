import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class counting_arraylist {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("enter count");
        int count=sc.nextInt();
        for(int i=0;i<count;i++)
        {
             System.out.println("enter number");
             list.add(sc.nextInt());
        }
    
    Collections.sort(list);
    System.out.println("sorted list:"+list);
    }
    
}
