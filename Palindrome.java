import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,digit;
        n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            digit=(n%10);
            sum=sum*10+digit;
            n=n/10;
        }
        //System.out.println(sum);
        if(sum==temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
     }
}
