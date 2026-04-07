import java.util.Scanner;

class bankaccount {
    private String accountnumber;
    private String accountholder;
    private double balance;

    public bankaccount(String accountnumber, String accountholder, double balance) {
        this.accountnumber = accountnumber;
        this.accountholder = accountholder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " .new balance:" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance .");
        } else {
            balance -= amount;
            System.out.println("withdraw" + amount + ".new balance." + balance);
        }
    }

    public void checkbalance() {
        System.out.println("account balance=" + balance);
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        bankaccount account = new bankaccount(accNo, name, balance);

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        account.checkbalance();
    }
}
