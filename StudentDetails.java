
public class StudentDetails {
   private int RollNo;
   private String Name;
   private int Marks;
     
    public void display()
    {
        System.out.println("Name: " + Name + "\n" + "RollNO :" + RollNo + "\n"+ " Marks: " + Marks);
    }  

    public void setRollNo(int RollNo)
    {
        this.RollNo=RollNo;
    }
    public void getRollNo()
    {
      System.out.print(RollNo);
    }

}

class Final{

 public static void main(String[] str)
{
    StudentDetails s1=new StudentDetails();
    // s1.RollNo=1;
    // s1.Name="Ranjeet";
    // s1.Marks=100;
    // s1.display();
    s1.setRollNo(10);
    s1.getRollNo();

 }
}
