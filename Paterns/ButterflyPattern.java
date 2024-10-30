package Paterns;

import java.util.Scanner;

public class ButterflyPattern {
     
   public void butterfly(int n)
    {
        //first half
      for(int i=1;i<=n;i++)
      {
         //first print i size of star in front
         for(int j=1;j<=i;j++)
         {
            System.out.print("*");
         }

         // print space of 2*(n-j)
         for(int j=1;j<=2*(n-i);j++)
         {
            System.out.print(" ");
         }
         //print start of i size
         for(int j=1;j<=i;j++)
         {
            System.out.print("*");
         }

         System.out.println();
      }
   



    //second half
    for(int i=n;i>=1;i--)
      {
         //first print i size of star in front
         for(int j=1;j<=i;j++)
         {
            System.out.print("*");
         }

         // print space of 2*(n-j)
         for(int j=1;j<=2*(n-i);j++)
         {
            System.out.print(" ");
         }
         //print start of i size
         for(int j=1;j<=i;j++)
         {
            System.out.print("*");
         }

         System.out.println();
      }
   }
   



    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ButterflyPattern pattrn=new ButterflyPattern();
        pattrn.butterfly(num);
        sc.close();
    }

}
