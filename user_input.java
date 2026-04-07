import java.util.Scanner;
public class user_input {
public static void main(String[] args)
{
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the array size.");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the array elements.");
     for(int i=0;i<arr.length;i++)
    {
       arr[i]=sc.nextInt();
    }
    System.out.println("Enterthe array elements.");
    
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
    
}
}
    
