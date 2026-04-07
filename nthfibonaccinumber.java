import java.util.Scanner;

public class nthfibonaccinumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        if (n == 0) {
            System.out.println("Nth Fibonacci number: " + a);
            return;
        }

        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Nth Fibonacci number: " + b);
    }
}