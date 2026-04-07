import java.util.*;
public class optional_ex {
    public static void main(String[] args)
    {
        Optional<String>s =Optional.ofNullable("hello i am kavya:");
    if(s.isPresent())
    {
        System.out.println("this is not null");
    }    
    else{
        System.out.println("null");

    }
}
}
