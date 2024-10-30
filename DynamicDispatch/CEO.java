package DynamicDispatch;

public class CEO {
    public static void main(String[] arg)
    {
       developer Rohit=new developer();
       Computer comp1=new Desktop();
       Rohit.code(comp1);
    }
    
}

class developer{
   public void code(Computer lap)
   {
    lap.code();
   }
}

class Desktop extends Computer{
    public void code()
    {
        System.out.println("Coding by desktop ");
    }

}
class Laptop extends Computer{
    public void code()
    {
        System.out.println("Coding by Laptop ");
    }
    
}
class Computer{
    
    public void code()
    {
        System.out.println(" Coding by Computer ");
    }
}
