import java.util.Scanner;
public class Series7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=1,c=2;
        System.out.printf("%.0f %.1f ",b,c);
        for(int i=1;i<a-1;i++)
        {
            if(i%2==1)
            {
                b=b*3;
                System.out.printf("%.1f ",b);
            }
            else
            {
                c=c*3;
                System.out.printf("%.1f ",c);
            }
        }
    }
}
