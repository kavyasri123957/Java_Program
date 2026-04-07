
import java.util.Scanner;
class hollow_right_triangle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();
        int rows=5;
        for(int i=0;i<=rows;i++)
        {
            int val=1;
             for(int sp=1;sp<=rows-i;sp++)
            {
                 System.out.print(" ");
            }
            for(int j=0;j<=i;j++) 
               {

                    System.out.print(val+" ");
                    val=val*(i-j)/(j+1);

                }
                System.out.println();
            }
        }
}
}
