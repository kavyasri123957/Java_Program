import java.util.Scanner;
import java.util.Arrays;
class two_equal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
System.out.println("enter 1st array elements:");
for(int i=0;i<arr1.length;i++)
{
    arr1[i]=sc.nextInt();
}
System.out.println("Enter 2nd array elements:");
for(int i=0;i<arr2.length;i++)
{
    arr2[i]=sc.nextInt();
}
System.out.println(Arrays.equals(arr1,arr2));
    }
}