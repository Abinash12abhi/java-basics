import java.util.Scanner;
public class Avg
{
    public static void main(String args[])
    {
        float a,b,c,d,e,sum;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        d=sc.nextFloat();
        e=sc.nextFloat();
        sum=(a+b+c+d+e)/5;
        System.out.printf("%.2f",sum);
    }
}
