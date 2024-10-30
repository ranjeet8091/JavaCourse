import java.util.HashMap;

public class Main {
      public static void main(String[] args) {
        HashMap<Character,Integer> hm =new HashMap<Character,Integer>();
        String s="HElloWorld";
        for(int i=0;i<s.length();i++)
        {
            Character c=s.charAt(i);

            if(hm.containsKey(c))
            {
            int v=hm.get(c);
            hm.put(c, v+1);
            }
            else
            {
                hm.put(c,1);
            }
        }
        System.out.println(hm);

        // for(Character key:hm.keySet())
        // {
        //     System.out.println(key + "->"+ hm.get(key) );
        // }

        for(int i=0;i<s.length();i++)
        {
            Character c=s.charAt(i);
            if(hm.containsKey(c))
            {
                System.out.println(c + " " + hm.get(c));
                hm.remove(c);
            }
            
        }
      }
}
