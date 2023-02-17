import java.util.Scanner;
public class Swap
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         Abhi ab=new Abhi();
         int a,b;
         a=sc.nextInt();
         b=sc.nextInt();
         ab.swp(a,b);
    }
}
class Abhi
{
    public static void swp(int a,int b)
    {
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println(a);
        System.out.println(b);  
    }
}
