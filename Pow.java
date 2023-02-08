import java.util.Scanner;
public class Pow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,sum=1;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<b;i++)
        {
            sum=sum*a;
        }
        System.out.println(sum);
    }
}
