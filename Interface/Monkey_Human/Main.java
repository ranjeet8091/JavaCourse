

interface basicAnimal{
    void eat();
    void sleep();
    
}

class Monkey{
    public void jump()
    {
      System.out.println("Jump");
    }
    public void bite()
    {
    System.out.println("Bite");
    }
}

class human extends Monkey implements basicAnimal
{
   public void eat()
   {
    System.out.println("Eat");
   }
   public void sleep()
   {
    System.out.println("Sleep");
   }
}

public class Main {
    public static void main(String[] args) {
        human h=new human();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();
        
    }
    
}
