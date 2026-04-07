class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        if (age > 0) {
            return age;
        }
        return 0;
    }
}

public class get_set {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Kavya");
        s.setAge(30);

        System.out.println("My name is: " + s.getName() + " My age is: " + s.getAge());
    }
}