import java.util.Optional;
public class optional_ex5{
public static void main(String[] args)
{
    Optional<String> name=Optional.of("java");
    Optional<String>upper=name.map(String::toUpperCase);
    System.out.println(upper.get());

}
}