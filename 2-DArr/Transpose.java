import java.util.Scanner;

public class Transpose {
       public static void main(String []a)
       {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int [][]result=new int[col][row];
        //transpose
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                result[j][i]=arr[i][j];
            }
        }
         System.out.println("Transpose loop");
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


       }
}
