package Paterns;
import java.util.*;
public class diamondPattern {
  
    public static void main(String a[])
    {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      //first half
      for(int i=1;i<=size;i++)
      {
        // print space
        for(int j=1;j<=size-i;j++)
        {
         System.out.print(" ");
        }
        //now print value
        for(int j=1;j<=2*(i-1)+1;j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }

      //second half
      for(int i=size;i>=1;i--)
      {
        // print space
        for(int j=1;j<=size-i;j++)
        {
         System.out.print(" ");
        }
        //now print value
        for(int j=1;j<=2*(i-1)+1;j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
    }

}
