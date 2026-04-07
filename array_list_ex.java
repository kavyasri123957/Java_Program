import java.util.ArrayList;
import java.util.Scanner;
public class array_list_ex
 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        names.add("dog");
        names.add("cow");
        names.add("cat");
        System.out.println(names);
        String s=sc.nextLine();
        names.remove(s);
        System.out.println("updated list:" + names);
    }
}
