public class Main {
    public static void main(String[] args) {
        int result=0;
        int a=10;
        int b=0;
        int arr[]=new int[5];
        static void validate(int age) throws ArithmeticException
        {
            if(age<18)
            throw new ArithmeticException();
            else
            System.out.println(" valid");
        }
        try{
          validate()
            System.err.println(arr[6]);
            if(b==0) throw new ArithmeticException();
            result=a/b;
        }
        catch(ArithmeticException ob)
        {
            System.out.println(ob);
            b++;    
            result=a/b;
        }
        catch(ArrayIndexOutOfBoundsException ob)
        {
            System.out.println(ob);
            b++;
            result=a/b;
        }
        catch(Exception pn)
        {
            System.out.println(pn);
        }
        finally{
            System.out.println("All resources atr reclaimed");
        }

        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
