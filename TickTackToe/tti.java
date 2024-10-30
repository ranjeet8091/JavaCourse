import java.util.*;
public class tti{
  static char[][] board=new char[3][3];
  Scanner sc=new Scanner(System.in);

    static public void main(String[] arg)
    {
      tti game=new tti();
      game.initiating();
     game.playgame();
    }

    void initiating()
    {
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          board[i][j]='-';
          System.out.print("-" + " ");
        }
        System.out.println();
      }
    }
    void playgame()
    {
      
    }
}