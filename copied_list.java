import java.util.ArrayList;
import java.util.Arrays;
public class copied_list {
    public static void main(String[] args)
    {
        ArrayList<String> list1=new ArrayList<>(Arrays.asList("A","B","C"));
        ArrayList<String>list2=new ArrayList<>(list1);
        System.out.println("copied list 2:"+list2);

}
    

}
