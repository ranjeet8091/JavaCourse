import java.util.*;
public class QuesEighteen{
    public static void main(String[] a)
    {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
           int arr[][]=new int[size][size];
            int rotated[][]=new int[size][size];
           
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

         for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                rotated[i][j]=arr[size-j-1][i];
            }
            
        }


         for(int i=0;i<rotated.length;i++)
        {
            for(int j=0;j<rotated[i].length;j++)
            {
               System.out.print(rotated[i][j]+" ");
            }
            System.out.println();
        }



    }

    
}