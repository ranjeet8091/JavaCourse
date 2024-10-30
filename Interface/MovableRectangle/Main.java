package Interface.ResizableRectangle;


import java.util.Scanner;

interface Shape{
    abstract double getPerimeter();
     abstract double getArea();

}

interface Resizable{
    abstract void resize(int percent);
}

class Rectangle implements Shape{
    protected int len,breadth;
    Rectangle(int l,int b)
    {
      len=l;
      breadth=b;
    }
    public double getPerimeter()
    {
        return 2*(len+breadth);
    }
    public double getArea()
    {
        return len*breadth;
    }
    public String toString()
   {
    return "Rectangle[length=" + len +", width=" + breadth +"]";
   }
}

class ResizableRectangle extends Rectangle implements Resizable{

    public ResizableRectangle(int l,int b)
    {
        super(l, b);
    }
     public void resize(int p)
   {
     len=len +len*(p/100);
     breadth=breadth + breadth*(p/100);
   }

   public String toString()
   {
    return "Rectangle[length=" + len +", width=" + breadth +"]";
   }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      Rectangle rec=new Rectangle(sc.nextInt(), sc.nextInt());
      System.out.println(rec.toString()); /// the toString Method is not implemented in Rectangle class but it gives the answer

      System.out.println(rec.getPerimeter());
      System.out.println(rec.getArea());

      ResizableRectangle rez=new ResizableRectangle(sc.nextInt(), sc.nextInt());
      System.out.println(rez.toString());
      System.out.println(rez.getPerimeter());
      System.out.println(rez.getArea());


        
    }
    
}
