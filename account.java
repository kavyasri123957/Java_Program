    public static void main(String[] args)
    {
        Account a=new Account();
        a.setBalance(12345.6788);
        System.out.println(a.getBalance);  
      }
    
class Account{
    int Balance=0;
    public void setBalance(double b)
    {
        Balance=b;
  }
}
public double getBalance()
{
    return Balance;
}

