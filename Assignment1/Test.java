import java.util.Scanner;
import java.util.Arrays;
class Test{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int result[]=new int[size];
        
        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=0;j<size;j++)
            {
                 if(arr[i]==arr[j])
                 {
                    count++;
                 }
            }
        }

        

    }   
}