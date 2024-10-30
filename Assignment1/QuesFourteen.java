import java.util.Scanner;
import java.util.Arrays;
class QuesFourteen{
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
//    Arrays.sort(arr);
//    System.out.println(arr[size-1]);
//     System.out.println(arr[size-2]);
//     System.out.println(arr[size-3]);
int max1=arr[0],max2=arr[0],max3=arr[0];
for(int i=0;i<size;i++)
{
  if(arr[i]>max1)
  {
    max1=arr[i];
  }
}

for(int i=0;i<size;i++)
{
  if(arr[i]<max1 && arr[i]>max2)
  {
    max2=arr[i];
  }
}

for(int i=0;i<size;i++)
{
  if(arr[i]< max1 && arr[i]<max2 && arr[i]>max3)
  {
    max3=arr[i];
  }
}
  System.out.println(max1);
  System.out.println(max2);
  System.out.println(max3);
    }
}