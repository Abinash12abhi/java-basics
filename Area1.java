import java.util.Scanner;
public class Area1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Abhi ab=new Abhi();
        int a,b,c;
        float d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextFloat();
        ab.ar(a,b,c,d);
    }
}
class Abhi
{
    public static void ar(int a,int b,int c,float d)
    {
      System.out.println(a*a);
      System.out.println(b*c); 
      System.out.printf("%.2f",3.141*d*d);
    }
}
