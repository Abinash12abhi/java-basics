import java.util.Scanner;
public class Dine
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=sc.nextInt();
        if(s.equals("front"))
        {
            if(a==1)
            {
                System.out.println("Left Handed");
            }
            else
            {
                System.out.println("Right Handed");
            }
        }
        else if(s.equals("rear"))
        {
            if(a==1)
            {
                System.out.println("Right Handed");
            }
            else
            {
                System.out.println("Left Handed");
            }
        }
        else
        {
            System.out.println("nothing");
        }
    }
}
