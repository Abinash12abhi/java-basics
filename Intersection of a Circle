import java.util.Scanner;
public class Circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x1,x2,y1,y2,r1,r2;
        x1=sc.nextInt();
        x2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();
        r1=sc.nextInt();
        r2=sc.nextInt();
        double c=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
        if(c==r1+r2)
        {
            System.out.println("The circles are tangential");
        }
        else if(c<=r1+r2)
        {
            System.out.println("The circles overlap");
        }
        else
        {
            System.out.println("The circles do not overlap");
        }
    }
}
