import java.util.Scanner;
public class Series8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,s=4;
        System.out.print(s+" ");
        for(i=1;i<=n-1;i++)
        {
            s=s+(i*i);
            System.out.print(s+" ");
        }
        //Write your code
    }
}
