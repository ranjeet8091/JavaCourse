package Paterns;

public class pattern2 {
    public static void main(String[] a)
    {
        int num=5;
     for(int i=1;i<=num;i++)
     {
        for(int j=1;j<=num-i+1;j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
    }
}
