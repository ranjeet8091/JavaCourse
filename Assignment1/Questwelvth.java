import java.util.Scanner;
class QuesTwelvth{
    public static void main(String[] a)
    {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];
    int sum=0;
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
        sum+=arr[i];
    }
    System.out.println(sum);
    }
}