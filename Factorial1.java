import java.util.Scanner;
public class Factorial1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Facts fa=new Facts();
        int n=sc.nextInt();
        fa.fac(n);
    }
}
class Facts//class for fact
{
    public static void fac(int n)
    {
        int fact=1,x=1;
        while(fact<n)
        {
            x=x+1;
            fact=fact*x;
        }
        if(fact==n)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.printf("no");
            }
    }
}
