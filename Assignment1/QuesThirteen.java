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
        
    }
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<size;i++)
    {
        if(arr[i]<min)
        {
            min=arr[i];
        }
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }
    System.out.println("max nummber is "+max);
     System.out.println("min nummber is "+min);
    }
}