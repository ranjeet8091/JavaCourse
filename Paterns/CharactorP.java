package Paterns;


public class CharactorP {
       public static void main(String a[])
       {
        char char1='A';
        for(int i=0;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(char1++ + " ");
            }
            System.out.println();
        }
       }
    
}