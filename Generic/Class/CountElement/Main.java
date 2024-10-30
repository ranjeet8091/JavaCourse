class Count <T>{
        Integer count;
       public Count()
        {
            count=0;
        }

        public  <T> Integer count(T[] arr )
        {
            for(T element :arr)
            {
                System.out.println(element);
                count++;
            }
            // System.out.println("The number of Element " + count);
            return count;
        }
         
}

public class Main {
    public static void main(String[] args) {
        Count obj=new Count();
        Integer arr[]={1,2,3,4,5,6};
        String arrS[]={"Ranjeet ","Tiwari ","Sagar " ,"Gupta " +"Vivek " + "Kumar"};
        System.out.println( "total numbers are " + obj.count(arrS));
        System.out.println( "total numbers are " + obj.count(arr));
    }
    
}
