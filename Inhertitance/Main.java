 class Vehicle {
    public void drive()
    {
        System.out.println("Repairing a vehicle");
    }
}
class Car extends Vehicle{
    public void drive()
    {
        System.out.println("Repairing Car");
    }
}

public class Main{
    public static void main(String []a)
    {
        Car c=new Car();
        c.drive();

        Vehicle v=new Vehicle();
        v.drive();

    }
}
