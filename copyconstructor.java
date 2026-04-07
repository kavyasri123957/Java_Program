public class copyconstructor{
    public static void main(String[] args){
        Student s=new Student("kavya",20);
        s.profile();
    }
    
}
class Student{
    String name;
    int age;
    Student(String n,int a){
        name=n;
        age=a;
    }
    void profile(){
        System.out.println("my name is "+name+"and age is:"+age);
    }

}


