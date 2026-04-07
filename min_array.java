
import java.util.Scanner;
public class min_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
       
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
           
            int min=arr[0][0];
             for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(min>arr[i][j])
                {
                    min=arr[i][j];
                }
                }
            }
            System.out.print(min+ " ");

}
}

    

