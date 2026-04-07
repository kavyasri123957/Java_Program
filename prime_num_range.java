import java.util.Scanner;
public class prime_num_range {
        public static void main(String[] args){
            int flag,n,i,j;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the range of a number:");
            n=sc.nextInt();
            flag=0;
               System.out.println("its  a prime number:");
            for(i=2;i<=n;i++)
            {
            flag=0;

            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag ==0)
            {
        
                System.out.println(i);

            }
    }
    }
}


