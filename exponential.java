public class exponential{
    public static long power(long base,long exp,long mod)
    {
        long result =1;
        base = base%mod;
        while(exp>0)
        {
            if((exp%2)==1)
            {
                result = (result*base)%mod;
            }
            base = (base*base)%mod;
            exp=exp/2;
        }
        return result;
    }
    public static void main(String[] args) {
        int a=2;
        int b=8;
        int m=13;
        System.out.println(power(a,b,m));
    }
    
}