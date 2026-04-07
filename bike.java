public class bike {
    public static void main(String[] args)
    {
        Car c=new Car();
        c.carname="bmw";
        c.carcolour="red";
        c.rate=20000;
        c.cardetails();
    }
    
}
class Car
{
    String carname;
    String carcolour;
    int rate;
    void cardetails(){
        System.out.println("my car name is: "+carname+  " colourmof the car:"+carcolour+  "  rate of the car is:"+rate);
    }
} 
