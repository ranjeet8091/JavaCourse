import java.util.Scanner;
class WuesFourth {
    public static void main(String[] arg) {
      Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    char ch=sc.next().charAt(0);
int result;
    switch(ch)
    {
     case '+':
      result=a+b;
       System.out.println(result);
       break;
     case '-':
     result=a-b;
       System.out.println(result);
       break;
     case '*':
       result=a*b;
       System.out.println(result);
       break;
     case '/':
      result=a/b;
       System.out.println(result);
       
     default:
      System.out.println("Enter wrong input");
      break;

    }
}
}