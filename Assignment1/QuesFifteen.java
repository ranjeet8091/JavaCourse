import java.util.Scanner;
import java.util.Arrays;
class QuesFifteen{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);
         int result[]=new int[size];
         int j=0;
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                result[j++]=arr[i];
            }
        }
        result[j++]=arr[size-1];

        for(int i=0;i<j;i++)
        {
            System.out.print(result[i]+ " ");
        }

        

    }   
}