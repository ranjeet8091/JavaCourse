import java.util.Scanner;

public class Question {
    public static void main(String []a)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        while (size-->0) {
            int num=sc.nextInt();
           int S3=((num/3)/2)*(2*3+(((num/3)-1)*3));
           int S5=((num/5)/2)*(2*5+(((num/5)-1)*5));

           int S15=((num/15)/2)*(2*15+(((num/15)-1)*15));

           System.out.println((S3+S5)-S15);
            
        }
    }
    
}
