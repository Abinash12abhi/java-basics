import java.util.Scanner;
public class Discount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c,total,discount,amount;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        total=a+b;
        discount=(total/100)*c;
        System.out.printf("%.2f \n",total);
        System.out.printf("%.2f \n",(total-discount));
        System.out.printf("%.2f \n",discount);
        //write your code
    }
}
