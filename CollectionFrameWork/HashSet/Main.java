

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,4,5,6,6,7};

        HashSet<Integer> hs=new HashSet<>();
        
        //add
        if(hs.add(10)) // it return boolean
        {
          System.out.println("Done");
        }
        hs.add(20);
        hs.add(20);
        hs.add(20);
        hs.add(15);

        //Clone
        // HashSet<Integer> newHS=(HashSet<Integer>) hs.clone();
        // System.out.println(newHS);

        //
        // Iterator<Integer> itr=hs.iterator();
        // while(itr.hasNext())
        // {
        //   System.out.println(itr.next());
        // }

    }
}
