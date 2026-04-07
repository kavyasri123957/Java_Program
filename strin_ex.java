import java.util.ArrayList;
import java.util.Arrays;
public class strin_ex {
    public  static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("dog","cat","cow"));
        String[] array=list.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
    }
    
}
