import java.util.Scanner;
public class Friendly1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Abhi ab=new Abhi();
        int i=1,a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        ab.fri(a,b);
        
    }
}
class Abhi
{
    public static void fri(int a,int b)
    {
        int c=0;
        int c1=0;
        {
        for(int i=1;i<=a;i++)
        {
            if(a%i == 0)
            {
                c=c+i;
            }
        }
        for(int i=1;i<=b;i++)
        {
            if(b%i==0)
            {
                c1=c1+i;
            }
       }
        
            if((c/a)==(c1/b))
            {
                System.out.println("Friendly Pair");
            }
            else
            {
                System.out.println("Not Friendly Pair");
            }
        }     
    }
}
