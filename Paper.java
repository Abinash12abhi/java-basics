import java.util.Scanner;
public class Paper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int total=((a*b)-((a*c)+100));
        System.out.println(total);
        //write your code
    }
}
