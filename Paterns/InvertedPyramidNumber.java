package Paterns;
import java.util.Scanner;

public class InvertedPyramidNumber {
    public static void main(String a[])
    {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      //int dummy=size;
      for(int i=0;i<size;i++)
      {
        for(int j=1;j<=size-i-1;j++)
        {
            System.out.print(j + " ");
        }
        //dummy--;
        System.out.println();
      }
    }
}
