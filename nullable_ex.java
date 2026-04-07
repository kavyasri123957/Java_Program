import java.util.Optional;
public class nullable_ex {
    public static  void main(String[] args)
    {
        Optional<String> s=Optional.ofNullable(null);
        String value=s.orElseGet(()-> "thiss is someone");
    System.out.println(value);
    }
    
}
