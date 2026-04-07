class student{
    String name;
    int marks;
     void speed()
     {
        System.out.println("my name is kavya"+name+"marks are"+marks);

     }
     class grade extends student{
        void display();
        System.out.println("student name is:"+name+"marks are"+marks);

     }
    } 
    
    public class inheritance_example {
    public static void main(String[] args)
    {
        student s=new student();
        s.name="kavya";
        s.marks=12;
        s.speed();
        s.display();


    }
    
}
