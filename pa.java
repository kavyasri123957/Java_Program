public class pa {
    interface Shape{
        void draw();

    }
    class circle implements Shape{
        public void draw()
        {
            System.out.println("squaare");
        }
    }
    class ShapeFactory{
        public Shape getShape(String type)
        {
            if(type.equals("circle")) return Circle();
            if(type.equals("square")) return Square();
            return null;
        }
    }
    
}
