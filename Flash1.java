import java.util.Scanner;
public class Flash1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,f;
        float total,area;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        f=sc.nextInt();
        total=a+c+e;
        area=b+d+f;
        System.out.printf("%.1f \n",total/3);
        System.out.printf("%.1f ",area/3);
        //write your code
    }
}
