import java.util.Scanner;
class QuesEleventh{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

         for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

    }   
}