
import java.util.*;

public class Main {
   public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<String>();

  list.add("Mango");  
  list.add("Apple");    
  list.add("Banana");    
  list.add("Grapes");    
  list.add(0,"Ranjeet");/// 0 is index 
  System.out.println(list);

    list.set(0,"Ranjeet" );
   System.out.println("After remove all");
   System.out.println(list);
 
}
}
