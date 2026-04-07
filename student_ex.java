class Person {
    String name;
    Person(String n) {
        name = n;
    }
    void display() {
        System.out.println("Name: " + name);
    }
}
class Student extends Person {
    int age;

    Student(String n, int a) {
        super(n);   
        age = a;
    }

    void display() {
        super.display();
        System.out.println("Age: " + age);
    }
}
public class student_ex {
    public static void main(String[] args) {
        Student s = new Student("Alice", 23);
        s.display();
    }
}