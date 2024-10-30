package Paterns;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    for(int i=1;i<=size;i++)
    {   
        //print spaces
        for(int j=1;j<=size-i;j++)
        {
            System.out.print(" ");
        }
       ///print number
        for(int j=1;j<=2*(i-1)+1;j++)
        {
            System.out.print(i);
        }
     System.out.println();
    }
    }
}
