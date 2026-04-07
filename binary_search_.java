import java.util.Scanner;
public class binary_search_ {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elments :");
        for (int i=0;i<arr.length;i++)
        {
              arr[i]=sc.nextInt();
        }
         System.out.println("enter the key value:");
        int key=sc.nextInt();
        int low=0;
        int high=n-1;
        boolean found=false;
        while(low<=high)
        {
           int mid=(high+low)/2;          
            if(key==arr[mid]){
                System.out.println("element found:"+mid);
                found=true;
                break;
        
        }else if(key<arr[mid])
        { 
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
if(!found)
{
    System.out.println("element not found");
}
    }
}


