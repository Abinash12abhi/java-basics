import java.util.Scanner;
public class Pattern6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i=n,j;
        for(i=n;i>=1;i--)
        {
            for(j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
       
    
}
