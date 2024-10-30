import java.util.Scanner;

interface GShape{
    void area();
    void perimeter();

}

class Circle implements GShape{
    double radius;
    public Circle(double r)
    {
            radius=r;
    }
     public void area()
     {
        String result=String.format("%.2f",Math.PI*radius*radius);
          System.out.println("Area of circle " +result);
      
     }

     public void perimeter()
     {
        String result=String.format("%.2f",2*Math.PI*radius);
        System.out.println("Circumference of circle " +result);
     }

}
class Rectangle implements GShape{
    int l;
    int b;
    public Rectangle(int le,int be)
    {
        l=le;
        b=be;
    }
    public void area()
     {
        System.out.println("Area of Rectangel " + l*b);
      
     }

     public void perimeter()
     {
        System.out.println("Perimater of Rectangle "+ 2*(l+b));
     }

}
class Triangle implements GShape{
    int a,b,c;
    public Triangle(int a,int b,int c)
    {
      this.a=a;
      this.b=b;
      this.c=c;
    }
    public void area()
     {
   System.out.println("Area of triangle " + 0.5 *(a+b+c));
      
     }

     public void perimeter()
     {
      System.out.println("Perimeter of Triangle " +(a+b+c));
     }
     
}

public class Shape {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Circle cl=new Circle(sc.nextDouble());
        cl.area();
        cl.perimeter();


        Rectangle Rl=new Rectangle(sc.nextInt(),sc.nextInt());
        Rl.area();;
        Rl.perimeter();


        Triangle Tl= new Triangle(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Tl.area();;
        Tl.perimeter();
    }
    
}
