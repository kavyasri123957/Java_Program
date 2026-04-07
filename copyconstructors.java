class student{
    String name;
    int marks;
    student(String n,int m){
        name=n;
        marks=m;
    }
    student(student s){
       name=s.name;
       marks=s.marks;
    }
       void display()
       {
        System.out.println("student name ="+name+"student marks="+marks);
       }

    }
public class copyconstructors {
    public static void main(String[] args)
    {
        student s1=new student("kavya",12);
        student s2=new student(s1);
        s2.display();
        

    }
    
}
