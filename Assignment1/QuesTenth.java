import java.util.Scanner;
class QuesTenth {
    public static void main(String[] arg) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int result=0;
    int p=0;
    while(num>0)
    { 
     int digit=num%10;
     if(digit%2==0)
     {
      int power=(int)Math.pow(10,p++);
      result=digit*power  + result;
     }
     
     num=num/10;
    }
    System.out.println(result);
    
}
}