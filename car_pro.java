class vehicle{
    void speed(){
        System.out.println("vehicle pseed"); 
       }
}
class car extends vehicle{
    void speed()
    {
System.out.println("car speed"); 
    }
    
}
class bike extends vehicle{
    void speed()
    {
System.out.println("bike speed"); 
    }
    
}

public class car_pro {
    public static void main(String[] args)
    {
       
        car c=new car();
        bike b=new bike();
        c.speed();
        b.speed();
    }
    
}
