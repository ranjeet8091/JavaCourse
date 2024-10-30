

import java.util.Scanner;

public class Main {
    public static int divide(int aa,int bb) throws ArithmeticException,ArrayIndexOutOfBoundsException
    {
        return aa/bb;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
            
            System.out.println(a+b);
            System.out.println(divide(a,b));
        }
         catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("All task Completed");
        }
    }
}
