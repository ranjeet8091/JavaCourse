import java.util.*;

public class Main {

    public static void Movelement(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]>=0)
            {
                for(int j=i-1;j>=0;j--)
                {
                    if(arr[j]<0)
                    {
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        for(int ele :arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
       int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
           arr[i]=sc.nextInt();
        }

        Movelement(arr,size);

        for(int ele :arr)
        {
            System.out.print(ele + " ");
        }

    }
}
