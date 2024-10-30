package Bitwise;

import java.util.Scanner;

public class SwapTwoVar {
    public static void main(String l[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Before Swapping : " + a + " " + b);

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping : " + a + " " + b);
    }
}
