import java.util.Scanner;
import java.util.Arrays;
class copy
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
        int copy[]=Arrays.copyOf(arr,arr.length);
         System.out.println("Copied array:");
        System.out.println(Arrays.toString(copy));
    }
}