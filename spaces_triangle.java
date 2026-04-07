import java.util.Scanner;
public class spaces_triangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //System.out.println("enter the no of rows :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int sp=1;sp<=n-i;sp++)
                {
                     System.out.print(" ");
                }
                    for(int j=1;j<=i;j++){
                
                System.out.print("*");
              }
        
        System.out.println();  
            }

    }
    
}
