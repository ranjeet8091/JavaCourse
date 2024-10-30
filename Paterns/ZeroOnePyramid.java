package Paterns;
 import java.util.Scanner;
public class ZeroOnePyramid {
    public static void main(String a[])
    {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      for(int i=1;i<=size;i++)
      {
        for(int j=1;j<=i;j++)
        {
            if((i+j)%2==0)
            {
                System.out.print("1");
            }
            else
            {
                System.out.print("0");
            }
        }
        System.out.println();
      }
    }
}
