import java.util.ArrayList;
import java.util.Scanner;
public class insertion_queue {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        System.out.println("entr the number of names:");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter name:");
            names.add(sc.nextLine());

        }
        System.out.println("Names List: " + names);

    }
    
}
