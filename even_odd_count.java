import java.util.Scanner;
import java.util.Arrays;
class even_odd_count
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elemnets:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("you entered array:");
        for(int i=0;i<arr.length;i++)
        {
System.out.println(arr[i]);
        }
        int even=0,odd=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]%2==0)
           {
            even++;
           }
           else{
            odd++;
           }
        }
        System.out.println("Even: "+even+", odd: "+odd);
    }
}