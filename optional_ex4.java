import java.util.Optional;
public class optional_ex4 {
    public static void main(String[] args)
    {
        Optional<String>name=Optional.of("Lambda");
    name.ifPresent(System.out::println);
    }
    
}
