
import java.util.*;

class Pair{
    int first;
    int second;
    public Pair(int f,int s)
    {
        first=f;
        second=s;
    }
}

public class Main {

    public static int checkOranges(int arr[][],int rows,int cols)
    {
        Queue<Pair> q=new LinkedList<>();
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j]==2)
                {
                    q.add(new Pair(i,j));
                }
            }
        }

        int change=0,time=0;
        int i,j;
        while(!q.isEmpty())
        {
            int size=q.size();

            for(int idx=0;idx<size;idx++)
            {
                Pair p=q.poll();
                i=p.first;
                j=p.second;

                //down
                if(i+1<rows && arr[i+1][j]==1)
                {
                    arr[i+1][j]=2;
                    q.add(new Pair(i+1,j));
                    change++;
                }

                //up
                if(i-1>=0 && arr[i-1][j]==1)
                {
                    arr[i-1][j]=2;
                    q.add(new Pair(i-1,j));
                    change++;
                }

                //right
                if(j+1<cols && arr[i][j+1]==1)
                {
                    arr[i][j+1]=2;
                    q.add(new Pair(i,j+1));
                    change++;
                }

                //left
                if(j-1>=0 && arr[i][j-1]==1)
                {
                    arr[i][j-1]=2;
                    q.add(new Pair(i,j-1));
                    change++;
                }

            }

            if(change>0)
            {
                time++;
                change=0;
            }
        }

        for(int k=0;k<rows;k++)
        {
           for(int l=0;l<cols;l++)
           {
            if(arr[k][l]==1)
            {
                return -1;
            }
           }
        }
        return time;

    }
    
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[][] grid = {
        {2, 1, 0, 2, 1},
        {1, 0, 1, 2, 1},
        {1, 0, 0, 2, 1}
    };

    int rows = grid.length;
    int cols = grid[0].length;

    int result = checkOranges(grid, rows, cols);
    if (result == -1) 
    {
        System.out.println("Not all oranges can be rotten.");
    } else 
    {
        System.out.println("Time taken to rot all oranges: " + result);
    }
   }



}
