import java.util.Scanner;
public class calculator_using_switch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the  first number");
        int a=sc.nextInt();
        System.out.println("eneter the second number");
        int b=sc.nextInt();
          System.out.println("enter the operator(+,-,/,*)");
          char op=sc.next().charAt(0);
          switch(op)
          {
            case '+':
                 System.out.println("result"+(a+b));
                 break;
                 case '-':
                     System.out.println("result"+(a-b));
                     break;
                     case '/':
                     System.out.println("result"+(a/b));
                     break;
                     case '*':
                     System.out.println("result"+(a*b));
                     break;
                     default:
                          System.out.println("nvalid operator");
                          

                     
                     



          }




    }
    
}
