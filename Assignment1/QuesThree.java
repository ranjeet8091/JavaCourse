import java.util.Scanner;
class QuesThree {
    public static void main(String[] arg) {
      Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     
     System.out.println("a and b before swap " + a +" " + b);
    
      a=a+b;
      b=a-b;
     a=a-b;
     System.out.println("a and b After  swap " + a +" " + b);
}
}