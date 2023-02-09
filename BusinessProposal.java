import java.util.Scanner;
public class BusinessProposal
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        float total,rate,amount,interest;
        System.out.println(t+".00");
        total=(r*t)+p;
        interest=(p*t*r)/100;
        rate=(2*interest)/100;
        amount=total-rate;
        System.out.printf("%.2f\n",total);
        System.out.printf("%.2f\n",rate);
        System.out.printf("%.2f\n",amount);
    }
}
 
