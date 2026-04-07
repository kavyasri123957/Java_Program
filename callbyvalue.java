public class callbyvalue {
    public static void main(String[] args){
        Student s=new Student("kavya",20);
        s.profile();
    }
    
}
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void profile(){
        System.out.println("my name is "+name+"and age is:"+age);
    }

}


