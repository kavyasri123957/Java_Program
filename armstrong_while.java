import java.util.Scanner;
public class armstrong_while{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    int num=sc.nextInt();
    int original_num=num;
    int sum=0,remainder,noofdigits;
    noofdigits=String.valueOf(num).length();
 while(num>0){
    remainder=num%10;
        sum+=Math.pow(remainder,noofdigits);
        num=num/10;
 }
    if(sum==original_num){
        System.out.println(original_num+"armstrong");  
      }else
        System.out.println(original_num+" not an armstrong");
}

    }