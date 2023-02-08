import java.util.Scanner;
public class Lcm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,max;
        a=sc.nextInt();
        b=sc.nextInt();
        max=a>b?a:b;
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
