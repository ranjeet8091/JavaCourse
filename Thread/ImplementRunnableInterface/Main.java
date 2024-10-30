
class Myth implements Runnable{

    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        for(int i=1;i<=5;i++)
        {
            System.out.println( Thread.currentThread().getName() + " " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Myth a1=new Myth();
        Myth a2=new Myth();
       Thread na1=new Thread(a1,"Task1") ;  
       Thread na2=new Thread(a1,"Task2") ;  
        na2.start();
        na1.start();
    }
    
}
