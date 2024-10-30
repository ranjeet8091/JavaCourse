package Paterns;

import java.util.Scanner;

public class palindromicPatern {
    public static void main(String []a)
    {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=1;i<=size;i++)
        {
            //space print
            for(int j=1;j<=size-i;j++)
            {
                System.out.print(" ");
            }

            //print number
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
