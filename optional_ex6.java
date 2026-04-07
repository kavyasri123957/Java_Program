import java.util.Scanner;
public class optional_ex6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
              arr[i]=sc.nextInt();
        }
        System.out.println("ENter  the key to search:");
        int key=sc.nextInt();
        int low=0;
        int high=n-1;
        boolean found=false;
        while(low<=high)
        {
            int mid=(high+low)/2;
            if(arr[mid]==key)
            {
            found=true;
            System.out.println("element found at inde"+mid);
            break;
    

        }

        else if(arr[mid]>key){
            high=mid-1;
        
                }  
            else{
                low=mid+1;
            }      
        }
        if(!found)
        {
        System.out.println("element not found in an array :");
        }


     
    }
    
}
