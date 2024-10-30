import java.util.Scanner;

class HollowRhombus {
    public static void main(String a[])
    {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      for(int i=1;i<=size;i++)
      {
        //first print the spaces
        for(int j=1;j<=(size-i);j++)
        {
            System.out.print(" ");
        }
        
           if(i==1 || i==size)
           {
            for(int j=1;j<=size;j++)
            {
                System.out.print("*");
            }
           }
           else
           {
            for(int j=1;j<=size;j++)
            {
                if(j==1 || j==size)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
           }
        
          System.out.println();
      }
    }
};
