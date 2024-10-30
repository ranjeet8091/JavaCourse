import java.util.*;
public class QuesNinteen{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int  sum=sc.nextInt();
          
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if((arr[i]+arr[j])==sum)
                {
                    System.out.println("Pairs : (" +arr[i]+ ", "+ arr[j] +" )");
                }
            }
        }
    }
}