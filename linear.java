import java.util.Scanner;
public class linear{
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements of the array");
        int[] arr=new int[n];
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
         System.out.println("enter the key value : ");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==key){
           found=true;
            System.out.println("element found:");
           }
        }
if(!found)
{
    System.out.println("element not found :");
}
}                   
}