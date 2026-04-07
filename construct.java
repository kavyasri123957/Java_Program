public class construct {
    public static void main(String [] args){
        Student s=new Student();
        s.profile();
    
    }
    
}
class Student {
    String name;
    int age;
    Student(){
        name="kVAYA";
        age=20;
    }

void profile()
{
    System.out.println("my name is :"+name+"and tthe age is  :"+age);
}
}
