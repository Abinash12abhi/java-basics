import java.util.Scanner;
public class factors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
