import java.util.stream.*;
import java.util.*;
public class stream_ex{
    public static void main(String[] args)
    {
        List<Integer>list=Arrays.asList(1,2,3,2,3,2,3);
        Set<Integer>set =list.stream()
        .collect(Collectors.toSet());
        System.out.println(set);
    }
    
}
