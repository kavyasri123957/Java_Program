import java.util.Scanner;
public class symmetric
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        boolean sym=true;
        System.out.println("enter the array");

         for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
               
        }
          for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
               
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(arr[j][i] != arr[i][j])
                {
                    sym=false;
                    break;
                }
            }
        }
        if(sym)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}