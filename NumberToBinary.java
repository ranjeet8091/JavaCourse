import java.util.*;
public class NumberToBinary {
    public static void main(String[] arr)
    {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int binary=0;
      int i=2;
      int place=1;
      int count=0;
     while(num>0)
     {
       int digit=num%i;
         binary=binary+ digit*place;
       place*=10;
       if(digit==1)
       {
         count++;
       }
       num/=10;
     }
      System.out.print(count);
    }
    }
    

