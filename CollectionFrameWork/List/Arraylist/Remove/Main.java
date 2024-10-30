
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

  list.remove("Mango");// it remove by value
  list.remove(0);// it remove by index

  Iterator itr=list.iterator();  

  while(itr.hasNext())
  {
    String fruit=(String)itr.next();
    if(fruit.equals("Apple"))
    {
      itr.remove();
    }
   }
   System.out.println(list);
 
}
}
