class Parent {
    void message() {
        System.out.println("parent");
    }
}

class child extends Parent {
    void message() {
        System.out.println("child");
    }

    void show() {
        message();        
        super.message(); 
    }
}

public class inhe {
    public static void main(String[] args)
    {
        child c = new child();  
        c.show();               
    }
}