import java.util.*;
public class max_element {
    public static void main(String[] args)
    {
        List<Integer>list=Arrays.asList(5,8,2,10,3);
        int max=list.stream()
        .max(Integer::compare)
        .get();
        System.out.println(max);
    }
    
}
