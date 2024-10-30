

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        try {
            System.out.println(arr[5]);
        System.out.println(arr[4]/0);
        } 
        catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e);
        }

    }
}
