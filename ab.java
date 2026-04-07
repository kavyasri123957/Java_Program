import java.util.Scanner;
class employee{
    String name;
    double salary;
    void display()
    {
        System.out.println("name "+ name+"salary"+salary);
    }
}
class manager extends employee{
    double bonus;
    void displaytotal()
    {
        System.out.println("total compensation"+(salary + bonus) );
    }
}
public class ab{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        manager m=new manager();
        System.out.println("enter the name ");
        m.name=sc.nextLine();
        System.out.println("enter the  salary ");
        m.salary=sc.nextDouble();
        System.out.println("enter the  bonus");
        m.bonus=sc.nextDouble();
        m.display();
        m.displaytotal();
        

    }
}
 
