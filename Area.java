import java.util.Scanner;
public class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextFloat();
        System.out.println(a*a);
        System.out.println(b*c);
        
        System.out.printf("%.2f",3.141*d*d);
    }
}
