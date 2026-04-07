class Vehicle{
    void display(){
        System.out.println("Vehicle");
    }
}
class car extends Vehicle{
    void speed(){
        System.out.println("car");
    }
}
class sportscar extends car{
    void calm(){
        System.out.println("sportscar");
    }
}
public class multilevel_ {
    public static void main(String[] args)

    {
        sportscar sc=new sportscar();
        sc.display();
        sc.speed();
        sc.calm();

        
    }
    
}
