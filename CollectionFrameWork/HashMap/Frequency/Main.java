import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();/////hello
        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
       // char Char[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            Character key=s.charAt(i);
            if(hm.containsKey(key))
            {
              int value=hm.get(key);
              hm.put(key, value+1);
            }
            else
            {
                hm.put(key,1);
            }
        }
        System.out.println(hm);
        int count=0;
          for(Character key:hm.keySet())
          {
           if(hm.get(key)==1)
           {
            count++;
           }
          }
          System.out.println(count);
          for(Integer val:hm.values())
          {
            System.out.println(val);
          }

          


    }
    
}
