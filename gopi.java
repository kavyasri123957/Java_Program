public class gopi {
    int balance=1000;
    synchronized void withdraw(int amount)
    {
        if(balance>=amount)
        {
            System.out.println("Processing  withdrqwal for"+Thread.currentThread().getName());
            balance=balance-amount;
            System.out.println("remaining balance:"+balance);
        }
        else{
            System.out.println("Insufficient blance for"+Thread.currentThread().getName());
        }
        class Customer extends gopi{
            gopi account;
            Customer(gopi account);
        }
    }
 public static void main(Stringg[] args)
 {
    
 }   
}
