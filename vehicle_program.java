class Vehicle{
Vehicle(){
    System.out.println("Vehicle constructor");
}
}
class Car extends Vehicle{
    Car(){
        super();
        System.out.println("Car constructor");
    }
}
public class vehicle_program{
    public static void main(String[] args){
        Car c= new Car();
    }
}