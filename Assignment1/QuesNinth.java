import java.util.Scanner;

public class QuesNinth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = 0;
        int place = 1; 

        while (num > 0) {
            int digit = num % 10;
            if (digit < 9) {
                digit += 1;
            }
            result = digit * place + result;
            num /= 10;
            place *= 10;
        }
        System.out.println("Resulting number: " + result);
    }
}
