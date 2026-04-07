import java.util.*;
public class distinct_ex {
    public static void main(String[] args){
    List<Integer>list=Arrays.asList(1,2,2,3,3,4,5);
    list.stream()
    .distinct()
    .forEach(System.out::println);
    }
    
}
