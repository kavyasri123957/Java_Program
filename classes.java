public class classes {
    public static void main(String[] args)
    {
        Student sc=new Student();
        sc.name="kavya";
        sc.age=20;
        sc.profile();

        }
        
    }
    class Student{
        String name;
        int age;
        void profile()
        {
            System.out.println("my name is :"+name+"and age is :"+age);
        }
    }
    

