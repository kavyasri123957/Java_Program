import java.util.Scanner;
public class array_user_input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter thr size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
         System.out.println("enter the elements of an array:");
        
         for(int i=0;i<n;i++)
         {
            arr[i]=sc.nextInt();
         }
           System.out.println("you entered elements are :");
           for(int i=0;i<n;i++)
         {
            System.out.println(arr[i]);
         }
         sc.close();


    }
    
}
