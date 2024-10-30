import java.util.Scanner;
class QuesSeventh {
    public static void main(String[] arg) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    
    for(int i=1;i<=10;i++)
   {
    int result=number*i;
    System.out.println(number +" * "+i+ " = " + result );
   }
        
   
       
}
}