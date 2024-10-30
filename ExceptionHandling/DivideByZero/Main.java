package ExceptionHandling.DivideByZero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dividend=sc.nextInt();
        int divider=sc.nextInt();
        try {
            int result=dividend/divider;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
