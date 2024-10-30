import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
          
        for(int i=0;i<s.length();i++)
        {
          Character key=s.charAt(i);
          if(hm.containsKey(key))
          {
            Integer val=hm.get(key);
            hm.put(key, val+1);
          }
          else
          {
            hm.put(key,1);
          }
        }
         
       
        int i=0;
        StringBuilder r=new StringBuilder();
        for(Character key:hm.keySet())
        {
            if(hm.get(key)>1)
            {
              System.out.println(key);
              r.append(key);
            }
        }
        System.out.println(r);
      
    }
}
