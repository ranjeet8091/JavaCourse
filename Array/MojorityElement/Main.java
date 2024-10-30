package Array.MojorityElement;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static int  MajorityElement(int arr[],int size)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int ele:arr)
        {
            if(hm.containsKey(ele))
            {
                int val=hm.get(ele);
                hm.put(ele,val+1);
            }
            else
            {
                hm.put(ele,1);
            }
        }
          
        int maxCount=0;
        int element=-1;
        for(Integer key:hm.keySet())
        {
            int count=hm.get(key);
            if(count>maxCount)
            {
                maxCount=count;
                element=key;
            }
        }
        if(maxCount >(size/2))
          return element;
          else
          return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(MajorityElement(arr,size));
    }
}
