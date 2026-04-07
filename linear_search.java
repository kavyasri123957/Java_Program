import java.util.Scanner;
public class linear_search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Boolean  found=false;
          System.out.println("enter the size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements in an array");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
           System.out.println("enter the key ");
        int key=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        if(arr[i]==key)
{
    found=true;
    System.out.println("element found at index"+i);
    break;
} 
    }
if(!found){
    System.out.println("element not found:");
}   }    }
    

