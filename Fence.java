import java.util.Scanner;
public class Fence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,diff,sum;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            sum=(a+b)*2;
            diff=(a*b)*1;
            System.out.println("Required length is "+sum+" m");
            System.out.println("Required quantity of carpet is "+diff+" sqm");
        }
        else if(a<b)
        {
            sum=(a+b)*2;
            diff=(a*b)*1;
            System.out.println("Required length is "+sum+" m");
            System.out.println("Required quantity of carpet is "+diff+" sqm");
        }
    }
}
