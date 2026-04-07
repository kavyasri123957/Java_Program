
class Person{
    String name;
    int age;
    void display()
    {
        System.out.println("my name is :"+name+"and age is "+age);

    }
}
class Student extends Person{
        int studentid;
            void displayStudent(){
            display();
            System.out.println("student is is:"+studentid);
        }
    }

    public class inheritance {
    public static void main(String[] args)
    {
        Student s=new Student();
        s.name="kavya";
        s.age=34;
        s.studentid=3036;
        s.displayStudent();
    }
    
}
