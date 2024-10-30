package Paterns;
import java.util.Scanner;

public class InvertedAndRotatedP {
    public static void main(String ar[])
    {    Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int dummy=size;
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size;j++)
            {
             if(j>=dummy)
             {
                System.out.print("*");
             }
             else{
                System.out.print(" ");
             }
            }
            dummy--;
            System.out.println();
        }
    }
}
