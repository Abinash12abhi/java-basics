import java.util.Scanner;
public class SumDif
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Abhi ab=new Abhi();
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(ab.sd(a,b));
        System.out.println(ab.ds(a,b));
    }
} 
class Abhi
{
    
    public static int sd(int a,int b)
    {
      int sum=a+b;
      return sum;
    }
    public static int ds(int a,int b)
    {
      int diff=a-b;
      return diff;
    }
}
