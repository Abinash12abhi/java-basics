import java.util.Scanner;
public class Simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t;
        float r,formula;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextFloat();
        formula=p*t*r;
        System.out.printf("%.2f",formula/100);
    }
}
