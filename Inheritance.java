 class Person {

    protected String name;
    protected int age;

    public Person(String n,int a)
    {
      name=n;
      age=a;
    }

    public void display()
    {
        System.out.println( "name: "+name + "Age: " + age );
    }
}

 class Student  extends Person{
     protected int StudentID;
     protected char section ;

     public Student (String name,int age,int StudentID ,char section)

     {
      //   this.name=name;
      //   this.age=age;
      super(name,age);
        this.StudentID=StudentID;
        this.section=section;
     }
     public void display()
     {
        super.display();
        System.out.println( "StudentID: "+StudentID + " section :" + section);
     }
  
}

 public class Inheritance{
         public static void main(String[] a)
         {
           Student obS=new Student("Ranjeet ",22 , 5039, 'G');
           obS.display();
         }
    
}

  