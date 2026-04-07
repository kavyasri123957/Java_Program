import java.util.Optional;
public class default_value {
    public static void main(String[] args)
    {
        Optional<String>name=Optional.ofNullable(null);
        System.out.println(name.orElse("Default Value:"))
    }
    
}
