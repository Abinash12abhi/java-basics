import java.util.Scanner;
public class Pattern9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        
        for(i=n;i>=1;i--)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=(i*2)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //Write your code
    }
}
