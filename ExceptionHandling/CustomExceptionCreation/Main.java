import java.util.Scanner;

class InvalidException extends Exception{
    String info;
    InvalidException(String inf)
    {
     info=inf;
    }
    
    public String toString()
    {
        return info;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int age=sc.nextInt();
        try
        {
            if(age<18)
            {
                throw new InvalidException("Invalid");
            }
            else
            {
                throw new InvalidException("valid");
            }
    
        }
        catch(InvalidException e)
        {
           System.out.println(e.toString());
        }
        
    }
}
