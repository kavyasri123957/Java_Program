import java.util.Scanner;
class hollo_sphere
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
             for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n){
                    System.out.println("*");
                }else{
                    System.out.println(" ");

                }
                System.out.println();
            }
        }
    }
}