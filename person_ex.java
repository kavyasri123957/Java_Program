class person{
    void name()
    {
        System.out.println("kavya");
    }
    void salary()
    {
        System.out.println("5000");
    }
}
class employee extends person{
    void show()
    {
    super.name();
    super.salary();
}
}
class manager extends employee{
    void display(){
    super.name();
    super.salary();
    }

}
        
public class person_ex {
    public static void main(String[] args)
    {

    
   
    employee e=new employee();
    manager m=new manager();
   e.show();
   m.display();
    
}
}
