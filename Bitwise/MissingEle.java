package Bitwise;

import java.util.Scanner;

public class MissingEle {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,4,5,6,7};
        int n=a.length+1;
        int xorArray=0;
        for(int num:a)
        {
          xorArray=xorArray^num;
        }

        int XorAllNumber=0;
        for(int i=1;i<=n;i++)
        {
         XorAllNumber=XorAllNumber^i;
        }

        System.out.println(xorArray ^ XorAllNumber);
    }
}
