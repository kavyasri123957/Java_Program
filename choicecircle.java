import java.util.Scanner;
class shape{
    void area(){}

}
class circle extends shape{
    double r;
    void area()
    {
        System.out.println("area of circle is :"+(3.14*r*r));
    }
}
class rectangle extends shape{
    double length,width;
    void area()
    {
        System.out.println("area of rectangle is :"+(length*width));

    }
}
public class choicecircle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        rectangle r=new rectangle();
        int choice=sc.nextInt();;
        shape s;
        if(choice==1)
        {
            circle c=new circle();
             System.out.println("enter the radius");
           c.r=sc.nextDouble();
           s=c;
        }else{
            rectangle ra=new rectangle();
            System.out.println("enter the length");
            ra.length=sc.nextDouble();
            System.out.println("enter the width");
            ra.width=sc.nextDouble();
            s=r;


        }
        s.area();
    }
    
}
