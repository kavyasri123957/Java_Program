import java.util.Scanner;
public class program101 {
    public static void main(String[] args)

    {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] data=new int[size];
        for(int i=0;i<size;i++)
        {
            data[i]=input.nextInt();
        }
        int[] prefix=new int[size];
        prefix[0]=data[0];
        for(int i=1;i<size;i++)
        {
prefix[i]=prefix[i-1]+data[i];
        }
        int start=input.nextInt();
        int end=input.nextInt();
        if(start==0)
        {
            System.out.println(prefix[end]);
        }
        else{
            System.out.println(prefix[end]-prefix[start-1]);
        }
    }
}
