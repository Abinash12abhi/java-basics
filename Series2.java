import java.util.Scanner;
public class Series2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int x=6,y=5;
        for(int i=1;i<=a;i++)
        {
            System.out.print(x+" ");
            x=x+y;
            y=y+5;
        }
        //Write your code
    }
}
