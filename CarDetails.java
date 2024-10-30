 class Car {
    private String Name;
    private  String ModelName;
    private String Color;
     
    void SetDetails(String n,String mn,String c)
    {
        Name=n;
        ModelName=mn;
        Color=c;
    }
    void getDetails()
    {
        System.out.println("Name:" + Name + "\n" + "ModelName : " + ModelName + "\n" + " Color: " + Color );
    }


}

class Carconstructor{
    private String Name;
    private  String ModelName;
    private String Color;

    Carconstructor(String n,String mn,String c)
    {
        Name=n;
        ModelName=mn;
        Color=c;
    }

    public void display()
    {
         System.out.println();
        System.out.print("Name:" + Name + "\n" + "ModelName : " + ModelName + "\n" + " Color: " + Color );
    }

}
public class CarDetails{
       public static void main(String[] arg)
       {
        Car c1=new Car();
        c1.SetDetails("Audi","Q7" ,"Lavender");
        c1.getDetails();

        Carconstructor cc=new Carconstructor("BMW","005D","Grey");
        cc.display();
       }
}


