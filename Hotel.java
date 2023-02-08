import java.util.Scanner;
public class Hotel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,total,rent;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>12)
        {
            System.out.println("Invalid Input");
        }
        else if(a==4||b==6||c==11||a==12)
        {
            total=(20*b)/100;
            rent=(total*c)+(b*c);
            System.out.print("Hotel Tariff: Rs."+rent+".00");
        }
        else
        {
            rent=b*c;
            System.out.println("Hotel Tariff: Rs."+rent+".00");
        }
    }
}
