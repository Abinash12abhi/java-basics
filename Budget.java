import java.util.Scanner;
public class Budget
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,total;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        total=((a*350)+(b*230)+(c*190)+(d*125)+(e*180));
        if(total<=15000)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
