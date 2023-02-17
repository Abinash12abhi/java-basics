import java.util.Scanner;
public class Harshard1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Abhi ab=new Abhi();
        int a;
        a=sc.nextInt();
        Abhi a1=new Abhi();
        a1.has(a);
    }
}
class Abhi
{
    public static void has(int a)
    {
        int rev=0,digit=0;
        int t=a;
        while(a>0)
        {
            digit=a%10;
            
            a=a/10;
            rev=rev+digit;
        }
        if(t%rev==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }
    }
        
}
