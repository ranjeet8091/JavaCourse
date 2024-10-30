

 abstract class Pens
 {
    abstract void Refill();
    abstract void write();
 }
 class Stationary extends Pens{
      public void Refill()
      {
       System.out.println("Refill");
      }
      public void write()
      {
        System.out.println("Write");
      }
 }
public class Pen {
    public static void main(String[] args) {
        Stationary Sl=new Stationary();
    Sl.Refill();
    Sl.write();

    }
    
}
