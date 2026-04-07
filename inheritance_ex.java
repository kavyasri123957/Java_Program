interface Father {
    public void showFather();
}

interface Mother {
    public void showMother();
}

class Child implements Father, Mother {

    public void showFather() {
        System.out.println("this is father:");
    }

    public void showMother() {
        System.out.println("this is mother:");
    }
}

public class inheritance_ex {
    public static void main(String[] args) {
        Child c = new Child();
        c.showFather();
        c.showMother();
    }
}