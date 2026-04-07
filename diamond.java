import java.util.Scanner;
class diamond
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows=sc.nextInt();
        for(int i=0;i<=rows;i++)
        {
            for(int sp=1;sp<=rows-i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        int m=rows-1;
        for(int i=m;i>=1;i--)
        {
            for(int sp=1;sp<=rows-i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}