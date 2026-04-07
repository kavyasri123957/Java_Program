
class Counter{
    static int Count=0;
    Counter()
    {
        Count++;
    }
    void show()

    {
        System.out.println(Count);

    }
    
}
 public class static_method
 {
    public static void  main(String[] args)
    {
        Counter c=new Counter();
          Counter c1=new Counter();

          c.show();
          c1.show();

    }
 }
