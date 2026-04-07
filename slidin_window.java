import java.util.Scanner;
public class slidin_window {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] data=new int[size];
        for(int i=0;i<size;i++)
        {

        data[i]=sc.nextInt();
        }
        int window=sc.nextInt();
        int current=0;
        for(int i=0;i<window;i++)
        {
current+=data[i];
        }
        int best=current;
        for(int i=window;i<size;i++)
        {
            current=current+data[i]-data[i-window];
            if(current>best)
                best=current;
        }
System.out.println(best);
    }
    
}
