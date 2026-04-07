interface Add
{
    public int sum(int a, int b);
}
class ADD_LAMDA
{
    public static void main(String[] args)
    {
        Add c=(a,b)->
        {
            int x=a+b;
            return x;
        };
        int s=c.sum(10,20);
        System.out.println(s);
    }
}
