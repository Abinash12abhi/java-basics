import java.util.Scanner;
public class Sum1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,sum=0;
        a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
