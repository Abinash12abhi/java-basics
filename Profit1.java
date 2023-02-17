import java.util.Scanner;
public class Profit1
{
    public static void main(String args[])
    {
         float a,b;
        Scanner sc=new Scanner(System.in);
        Abhi ab=new Abhi();
        a=sc.nextFloat();
        b=sc.nextFloat();
    ab.pro(a,b);
    }
}
class Abhi
{
    public static void pro(float a,float b)
    {
        float total,sum,p;
       p=a/12;
        if(p>b)
        {
            total=(p-b)*12;
            System.out.println("Enter the price of a dozen mangoes");
            System.out.println("Enter the price at which 1 mango is being sold");
            System.out.printf("Loss : Rs.%.2f",total);
        }
        else if(p==b)
        {
             total=(p-b)*12;
            System.out.println("Enter the price of a dozen mangoes");
            System.out.println("Enter the price at which 1 mango is being sold");
            System.out.println("No profit nor loss");
        }
        else
        {
            total=(b-p)*12;
            System.out.println("Enter the price of a dozen mangoes");
            System.out.println("Enter the price at which 1 mango is being sold");
            System.out.printf("Profit : Rs.%.2f",total);
        }
    }  
}
