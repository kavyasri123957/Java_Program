class Vehicle{
    String type = "Vehicle";
}
class Car extends Vehicle{
    String type = "Car";
    void show(){
        System.out.println(type);
        System.out.println(super.type);
    }
}
public class vehi{
    public static void main(String[] args){
        Car c= new Car();
        c.show();
    }
}