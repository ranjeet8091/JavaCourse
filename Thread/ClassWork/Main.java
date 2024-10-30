

class Myth extends Thread{

    //for changing the thread name
    Myth(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        for(int i=1;i<=5;i++)
        {
            System.out.println( Thread.currentThread().getName() + " " + i);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Myth a1=new Myth("Task 1");
        Myth a2=new Myth("Task 2");
      //  a1.run(); /// dirrectely we can apply run method. but cant not parrelel processing // thread name main
        
        a2.start();
        a1.start();
        a2.start();
    }
    }
