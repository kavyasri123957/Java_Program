import java.util.Scanner;
public class transpose_matrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of rows");
        int rows=sc.nextInt();
         System.out.print("enter the no of  columns");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        int trans[][]=new int[cols][rows];
         System.out.print("enter matrix");
         for(int i=0;i<rows;i++)

            {
                for(int j=0;j<cols;j++)
                {
                    arr[i][j]=sc.nextInt();
                }

            }
            for(int i=0;i<rows;i++)

            {
                for(int j=0;j<cols;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
         for(int i=0;i<rows;i++)

            {
                for(int j=0;j<cols;j++)
                {
                    trans[j][i]= arr[i][j];
                   

                }
                

            }
            for(int i=0;i<rows;i++)

            {
                for(int j=0;j<cols;j++)
                {
                     System.out.print(trans[i][j]+" ");
                    
        }
          System.out.println();
    }
}
}
            
        

