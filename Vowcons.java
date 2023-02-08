import java.util.Scanner;
public class Vowcons
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println("Vowel");
        }
        else if(Character.isDigit(c)) 
        {
            System.out.println("Not an alphabet");
        }
        else
        {
            System.out.println("Consonant");
        }
}
}
