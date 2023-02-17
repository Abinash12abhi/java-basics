import java.util.Scanner;
public class Lcm1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Abhi ab=new Abhi();
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        ab.lcm(a,b);
    }
}
class Abhi
{
    public static void lcm(int a,int b)
    {
        int max=a>b?a:b;
        while(true)
        {
         if(max%a==0 && max%b==0)
         {
             System.out.printf("LCM of %d and %d is %d",a,b,max);
             break;
         }
        ++max;  
        }
    }
}
