import java.util.Scanner;
public class ProDiv1
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       Abhi ab=new Abhi();
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(ab.pd(a,b));
        System.out.println(ab.dp(a,b));
        System.out.println(ab.pp(a,b)); 
    }
}
class Abhi
{
    public static int pd(int a,int b)
    {
        int mul=a*b;
        return mul;
    }
    public static int dp(int a,int b)
    {
        int div=a/b;
        return div;
    }
    public static int pp(int a,int b)
    {
        int mod=a%b;
        return mod;
    }
}
