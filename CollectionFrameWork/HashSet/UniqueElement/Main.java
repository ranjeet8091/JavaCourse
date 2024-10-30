import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Size=sc.nextInt();
        int arr[]=new int[Size];
        for(int i=0;i<Size;i++)
        {
         arr[i]=sc.nextInt();
        }
         
        HashSet<Integer> hs=new HashSet<>();
         
        for(int i=0;i<arr.length;i++)
        {
            
                hs.add(arr[i]);
        
        }
        int hsize=hs.size();
        int result[]=new int[hsize];
        int i=0;
        Iterator<Integer> itr=hs.iterator();
        while (itr.hasNext()) 
        {
            result[i++]=itr.next();
        }

        for(int j=0;j<result.length;j++)
        {
          System.out.print(result[j]+" ");
        }


    }
}
