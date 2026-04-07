import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
public class add_all{
    public static void main(String[] args)
    {
        LinkedList<String> list1=new LinkedList<>(1,2,3);
        LinkedList<String>list2=new LinkedList<>(4,5,6);
        list1.addAll(list2);
        System.out.println("copied list 2:"+list2);

}
    

}

