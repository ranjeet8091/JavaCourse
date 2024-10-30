import java.util.*;
   class QuesTwenty{
    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

         int result[]=new int[size];
         int k=0;
        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]>arr[i])
                {
                  result[k++]=arr[j];
                  count++;
                  break;
                }     
            }
            if(count==0)
             result[k++]=-1;
        }

        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}