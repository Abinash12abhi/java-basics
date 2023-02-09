import java.util.Scanner;
public class transpose
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int row,colum;
       row=sc.nextInt();
       colum=row;
       int arr[][]=new int[row][colum];
       int arr1[][]=new int [row][colum];
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<colum;j++)
           {
               arr[i][j]=sc.nextInt();
           }
       }
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<colum;j++)
           {
               arr1[i][j]=arr[j][i];           }
       }
    
    System.out.println("Transpose matrix is :");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<colum;j++)
        {
            System.out.print(arr1[i][j]+" ");
        }
        System.out.println("\n");
    }
} 
}
