import java.util.Scanner;
public class Pattern3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,row;
        row=sc.nextInt();
        for(i=0;i<row;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
