class payment{
    void pay()
    {
        System.out.println("payment done");
    }
}
class cash extends payment{
    void pay()
    {
        
        System.out.println("paid by cash");
    }
}
class card extends payment{
    void pay()
    {
        
        System.out.println("paid by card");
    }
}
public class animal {
    public static void main(String[] args){
        payment p=new cash();
        p.pay();
        payment c=new card();
        c.pay();

    
    }
    
}
