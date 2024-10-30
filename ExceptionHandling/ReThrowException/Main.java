

public class Main {

   public static void parseAndRethrow(String str) throws NumberFormatException
   {
       try {
        int num=Integer.parseInt(str);
       System.out.println("Parsed Number is : "+ num);
       } 
       catch (NumberFormatException e) {
        System.out.println("Caught in parseAndRethrow : Number Format Error ");
        throw e;
       
       }
   }

    public static void main(String[] args) {
        try {
            parseAndRethrow("1234");
        } 
        catch (NumberFormatException e) {
            System.out.println("Caught in main : Number Format Error");
            e.printStackTrace();
            
        }
    }
}
