public class method_overriding {
    public static void main(String[] args)
    {
        Animal a = new Dog();
        a.sound();
        Dog d = new Dog();   
        d.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}