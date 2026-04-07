interface SquareRoot
{
    double find(int x);
}
class SQUAREROOTLAMDA
{
    public static void main(String[] args)
    {
        SquareRoot s=Math::sqrt;
        System.out.println(s.find(16));
    }
}