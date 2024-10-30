package Example;

class Test<T>{
    protected T data;
    public Test(T data)
    {
        this.data=data;
    }

    public  void getData()
    {
        System.out.println(data);
    }

}
public class Main {
    public static void main(String[] args) {
        int a=6;
      Test<Integer> obj=new Test<Integer>(a);
      obj.getData();
    }
}
