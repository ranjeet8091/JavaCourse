
import java.util.*;

public class Main {
   public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>( Arrays .asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5)); 
    ArrayList<Integer> NewList=new ArrayList<>();
    System.out.println(list);
    System.out.println(" List after removing element Remove ");
    
    for(Integer ele:list)
    {
     if(!NewList.contains(ele))
     {
        NewList.add(ele);
     }
    }
    System.out.println(NewList);
   
 
}
}
