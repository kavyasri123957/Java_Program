import java.util.Scanner;
public class two_pointers {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] data=new int[size];
        boolean status=false;
        for(int i=0;i<size;i++)
        {
            data[i]=input.nextInt();
        }
        int target=input.nextInt();
        int left=0;
        int right=size-1;
        while(right>left)
        {
int total=data[left]+data[right];
if(total==target)
{
    System.out.println("Pair found:");
    status=true;
    break;
}
if(total<target)
{
    left++;
}else{
    right--;
}
if(!status)
{
    System.out.println("not found:");
}
        }


    }
    
}
