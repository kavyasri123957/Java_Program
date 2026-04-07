public class k {
    public static void main(String[] args )
    {
        car c= new car();
        c.display();
        c.speed();
    }
    
}
class vehicle{
    void display()
    {
        System.out.println("vehicle");
    }
}

class car extends vehicle{
    void speed()
    {
        super.display();
        System.out.println("car");
    }
}