interface drawable{
    void draw();
}
class rectangle implements drawable{
    public void draw()
    {
        System.out.println("drawing rectangle");
       
    
}
    }
     public class multiple {
        public static void main(String[] args)
        {
            rectangle r=new rectangle();
            r.draw();
            

        }
     }
