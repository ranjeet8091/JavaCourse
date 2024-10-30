package String;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []arr)
    {
        // String s1="Welcome";
        // String s2=new String("Welcome");// this create new address every time in non pool area
        // String s3="Welcome";
        // String s4="Hello";


        // if(s1==s2)
        // {
        //     System.out.println("Equal");
        // }
        // else
        // {
        //     System.out.println("Not Equal");
        // }

        // we can check like this

        // if(s1.equals(s2))
        // {
        //     System.out.println("Equal");
        // }
        // else
        // {
        //     System.out.println("Not Equal");
        // }

        //Another example
        // if(s1==s3)
        // {
        //     System.out.println("Equal");
        // }
        // else
        // {
        //     System.out.println("Not Equal");
        // }

        //Another

        // if(s1==s4)
        // {
        //     System.out.println("Equal");
        // }
        // else
        // {
        //     System.out.println("Not Equal");
        // }

        //Another
        // String s5=new String(s1);
        // if(s1==s5)
        // {
        //     System.out.println("Equal");
        // }
        // else
        // {
        //     System.out.println("Not Equal");
        // }

        // s1=s1+s2;
        // System.out.print(s1);  /// it runs succesfully

        // s1="WElcome";
        // System.out.println(s1);


        // String s=new StringBuffer("").append(s1).append(s2).toString();
        // System.out.println(s.hashCode());


        // String s9="coding";
        // String s10=null;
        // System.out.println(10+s9+30);

        //indexof

        // String s9="coding di";
        // String s10=null;
        // System.out.println(s9.indexOf("di",3));


        //   String s9="coding di";
        // String s10=null;
        // System.out.println(s9.lastIndexOf("di"));


        //     String s9="coding di";
        // String s10=null;
        // char []ch=s9.toCharArray();
        // System.out.println(ch[2]);


        //     String s9="coding di";
        // String s10=null;
        // System.out.println(s9.contains("di"));

        // String s9="Ranjeet Tiwari";
        // int id =5039;
        // String result=String.format("My name is %s and %d", s9,id);
        // System.out.println(result);


        // String name="Ranjeet";
        // String sername="RAnjeet";
        // String  nn=new String("Ranjeet");
        // System.out.println(name.compareTo(sername));


        
        // String name="Ranjeet";
        // String sername="RAnjeet";
        // String  nn=new String("Ranjeet");
        // System.out.println(name.compareToIgnoreCase(sername));



        // String name="Ranjeet is Brahman";
        //  String []wordsw=name.split(" "); //
        //  System.out.println(wordsw);


        // String words[]={"Ranjeet" ,"is" , "Brahman"};


        // StringBuilder sb=new StringBuilder("Hello");

        // String words[]={"Ranjeet Tiwari "};
        // System.out.println(String.join(" ",words));
        

        //string buffer
        // StringBuffer str1=new StringBuffer("my nam is ranjeet Tiwari");
        // System.out.println(str1);
        // System.out.println(str1.length());
        // System.out.println(str1.capacity());

        // StringBuffer str1=new StringBuffer("my nam is ranjeet Tiwari");
        // str1.append(". i am 22 years old");
        // System.out.println(str1);


        // StringBuffer str1=new StringBuffer("my nam is ranjeet Tiwari");
        // str1.insert(6, " true");
        // System.out.println(str1);


//         StringBuilder str=new StringBuilder("My name is Ranjeet");
//         StringBuffer str1=new StringBuffer("My name is Ranjeet");
         
//         //builder

//         long start=System.currentTimeMillis();
//         for(int i=0;i<=10000000;i++)
//         {
//             str.append("World");
//         }
//         long end=System.currentTimeMillis();
//         System.out.println(end-start);
//    //buffer

//       start=System.currentTimeMillis();
//         for(int i=0;i<=10000000;i++)
//         {
//             str1.append("World");
//         }
//         end=System.currentTimeMillis();
//         System.out.println(end-start);

        //  StringTokenizer str=new StringTokenizer("Hello ranjeet"); //by default it is space deliminator
        //  StringTokenizer str1=new StringTokenizer("Hello ranjeet","!");//single deliminator
        //  StringTokenizer str2=new StringTokenizer("Hel!lo ranjeet"," !");// multiple deliminator 
        //  //with space
        //  System.out.println(str);
        //  while(str.hasMoreTokens())
        //  {
        //     System.out.println(str.nextToken());
        //  }
        
        // int a[]=new int[]{1,2,3,454,5,6,7,7,7,7};
        // System.out.println( a.getClass().getSuperclass());

        // int [][] a;
        //  a=new int[3][3];

        // int [][]b=new int[3][3];

    //    int [][]a=new int[3][3];

    //    for(int i=0;i<3;i++) // size we can replaced with a.length
    //    {
    //     for(int j=0;j<3;j++)////  size we can replaced with a[i].length
    //     {
    //          a[i][j]=st.nextInt();
    //       }
    //    }

    // int []a={1,2,3,4,5,6,6,6};

    // for(int []e: a)
    // {
    //   for(int v : e)
    //   {
    //    System.out.println(v);
    //   }

    // }

    Boolean result= Arrays.equal(a,b);

    string c=Arrays.toString(a);

    int []a=new int[50];
    Arrays.fill(a,1);

    Arrays.sort(a); 

    int i=Arrays.binarySearch(a,1); 





    }

}
