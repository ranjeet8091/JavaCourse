import java.util.Scanner;

public class Main {

    public static void PrintDiagonal(int ar[][],int size)
    {
        for(int col=0;col<size;col++)
        {
            int i=0;//row
            int j=col;//col
            while(j>=0  && i<size )
            {
                System.out.print(ar[i][j]+" ");
                i++;
                j--;
            }
        }
        for(int row=1;row<size;row++)
        {
            int i=row;//row
            int j=size-1;//col
            while(j>=0  && i<size )
            {
                System.out.print(ar[i][j]+ " ");
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        PrintDiagonal(arr,size);
    }

       
}
