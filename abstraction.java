public class abstraction {
    public static void main(String[] args)
    {
        Shape s = new Circle();   
        s.area(5);               
    }
}


abstract class Shape {
    abstract void area(double r);   
}


class Circle extends Shape {
    void area(double r) {
        double result = 3.14 * r * r;
        System.out.println("Area of circle: " + result);
    }
}