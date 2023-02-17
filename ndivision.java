import java.util.Scanner;
public class ndivision
{
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<b;i++)
        {
            if(i%7==0 && i%5!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
