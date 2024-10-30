package Paterns;

import java.util.Scanner;

public class SoildRhombus {
    void Rhombus(int n)
    {

    for(int i=1;i<=n;i++)
      {
         //first space
         for(int j=1;j<=n-i;j++)
         {
            System.out.print(" ");
         }

         // print star
         for(int j=1;j<=n;j++)
         {
            System.out.print("*");
         }
         //print start of i size
        //  for(int j=1;j>i;j++)
        //  {
        //     System.out.print(" ");
        //  }

         System.out.println();
      }
    }

    public static void main(String a[])
    {
   Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        SoildRhombus pattrn=new SoildRhombus();
        pattrn.Rhombus(num);
        sc.close();   
    }
}
