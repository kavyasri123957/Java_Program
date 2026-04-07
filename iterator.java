import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class iterator{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one" ,"two", "three"));
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}