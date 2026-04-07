class student{
    private int marks;
    public void Setmarks(int m){
        marks=m;
    }
        public int getmarks()
        {
            return marks;
        }
    }
    public class encapsulation {
    public static void main(String[] args)
    {
        student s=new student();
        s.Setmarks(90);
        System.out.println(s.getmarks());

    }
    
}
