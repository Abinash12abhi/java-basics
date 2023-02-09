import java.util.Scanner;
public class Type
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int even=0,odd=0,t;
        t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            if(arr[i]%2==0)
            {
                even=even+1;
            }
            else
            {
                odd=odd+1;
            }
        }
        if(even==t)
        {
        System.out.println("even");
        }
        else if(odd==t)
        {
            System.out.println("odd");
        }
        else
        {
            System.out.println("mixed");
        }
    }
}
