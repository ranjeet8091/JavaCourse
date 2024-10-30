import java.util.Scanner;
class QuesEighth {
    public static void main(String[] arg) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    
    if((number & 1)==0)
    {
   System.out.println(number + " is even");
    } 
   
    else
    System.out.println(number + " is odd");
       
}
}