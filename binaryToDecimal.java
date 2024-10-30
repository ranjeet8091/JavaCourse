import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary code");
        int binary=sc.nextInt();

        int decimal=0;
        int p=-0;
        while(binary>0)
        {
            int digit=binary%10;
            decimal+= digit*Math.pow(2,p++);

            binary/=10;
        }
        System.out.println("Binary is converted into decimal");
        System.out.print(decimal);

    }
    
}
