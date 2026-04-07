import java.util.*;
public class min_ex {
    public static void main(String[] args)
    {
        List<Integer>list=Arrays.asList(5,8,2,10,3);
        int min=list.stream()
        .min(Integer::compare)
        .get();
        System.out.println(min);
    }
    
}

