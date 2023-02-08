import java.util.Scanner;
public class Series3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            int i1=3;
            int cube=(int)Math.pow(i1,i);
            System.out.print(cube+" ");
        }
    
    }
}
