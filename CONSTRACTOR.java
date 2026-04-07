import java.util.*;
interface ListCreator
{
    ArrayList<Integer> create();
}
class CONSTRACTOR
{
    public static void main(String[] args)
    {
        ListCreator lc=ArrayList::new;
        ArrayList<Integer>list=lc.create();
        list.add(10);
        list.add(20);
        System.out.println(list);
    }
}