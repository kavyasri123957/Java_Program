public class circle_area {
    public static void main(String[] args)
    {
        circle c=new circle(4);
        c.area();
        rectangle r=new rectangle(2,3);
        r.area();
    }
}
class shape{

}

class circle extends shape{
double a;
circle(double r)

{
    
     a=3.14*r*r;
    
}
void area()
{
    System.out.println(a);
}
}
class rectangle extends  shape
{
    int a;
    rectangle(int l,int b)
    {
        a=l*b;
    }
    void area()
    {
         System.out.println(a);
    }

}