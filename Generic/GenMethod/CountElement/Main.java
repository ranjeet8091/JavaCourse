package CountElement;


public class Main {
    public static <E> void print(E[] arr)
    {
        int count=0;
      for(E Element:arr)
      {
       System.out.print(Element + " ");
       count++;
      }
      System.out.println();
      System.out.println("Total number of elements " + count);

    }
    public static void main(String ar[])
    {
        Integer arr[]={1,2,34,5,6,7};
        Character ch[]={'R','T'};
        print(arr);
        print(ch);
    }
    
}
