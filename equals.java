public class equals {
    public static void main(String[] args)
    {
        String s1="prabhas";
        String  s2="prabhas";
        String s3=new String("prabhas");

        System.out.println(s1.equals(s2));
           System.out.println(s1==s2);
            System.out.println(s1.equals(s3));
             System.out.println(s1==s3);



    }
    
}
