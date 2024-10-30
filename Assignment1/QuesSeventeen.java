import java.util.*;
public class QuesSeventeen{
    public static void main(String[] a)
    {
        Scanner sc= new Scanner(System.in);
        int row1=sc.nextInt();
         int clomn1=sc.nextInt();
           int arr[][]=new int[row1][clomn1];
           
           int row2=sc.nextInt();
         int clomn2=sc.nextInt();
        int arr1[][]=new int[row2][clomn2];


        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        int result[][]=new int[row1][clomn2];
         for(int i=0;i<row1;i++)
        {
            for(int j=0;j<clomn2;j++)
            {
                result[i][j]=0;
                for(int k=0;k<clomn1;k++)
                {
                    result[i][j]+=arr[i][k]*arr1[k][j];
                }
            }
            
        }


         for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
               System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }



    }

    
}