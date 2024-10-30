import java.util.Scanner;
class QuesFifth {
    public static void main(String[] arg) {
    Scanner sc=new Scanner(System.in);
    int unit=sc.nextInt();
    int bill; 
    
    if(unit<=100)  
    {
     bill=unit * 4 ;
     System.out.println("Amount to be paid: " + bill + " (Including tax and fixed charges)");
    }
    
    else if(unit>100 && unit<=200)  
    {
     bill=unit * 6 ;
     System.out.println("Amount to be paid: " + bill + " (Including tax and fixed charges)");
    }
    
     else if(unit>=200 && unit<=300)  
    {
     bill=unit * 8;
     System.out.println("Amount to be paid: " + bill + " (Including tax and fixed charges)");
    }
    
   else
   {
   bill=unit*10;
   System.out.println("Amount to be paid: " + bill + " (Including tax and fixed charges)");

    }
    
   
       
}
}