class student{
    String name;
    int marks;
    student(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }
    void display()
    {
        System.out.println("Student name is "+name+"Student age="+marks);

    }
}
 public class defaultconstructors {
    public static void main(String[] args)
    {
        student s=new student("kavya",5);
        s.display();

    }
}
    

