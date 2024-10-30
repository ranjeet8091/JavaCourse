package Add;
import java.util.ArrayList;
import java.util.*;

public class Main {
   public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<String>();
    ArrayList<String> list1=new ArrayList<String>();    

  list.add("Mango");  
  list.add("Apple");    
  list.add("Banana");    
  list.add("Grapes");    
  list.add(0,"Ranjeet");/// 0 is index 
//   System.out.println(list);

  list.addAll(list1);

  Iterator itr=list.iterator();  
  Iterator itr2=list1.iterator();
  while(itr.hasNext())
  {
   System.out.println(itr.next());

   }
   while(itr2.hasNext())
  {
   System.out.println(itr2.next());

   }
}
}
