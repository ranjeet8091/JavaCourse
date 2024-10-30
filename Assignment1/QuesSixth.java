import java.util.Scanner;
class QuesSixth {
    public static void main(String[] arg) {
    Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
   
    if(year%4==0)
    {
    System.out.println("Leap year");

     }
        
    else if(year%100==0)
    {
      if(year%400==0)
       System.out.println("Leap year");
     }
    
 else
  {
  System.out.println("Not Leap year");
}
    
   
       
}
}