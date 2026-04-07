import java.util.Arrays;
public class anagram {
    public static void main(String[] args)
    {
        String s1="listen";
         String s2="silent";
         char a[]=s1.toCharArray();
         char b[]=s2.toCharArray();
         Arrays.sort(a);
          Arrays.sort(b);
          System.out.println(a);
           System.out.println(b);
           if(Arrays.equals(a,b))
           {
            System.out.println("yes");

           }else{
             System.out.println("no");

           }
        }


        

    
}
