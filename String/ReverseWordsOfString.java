package String;

import java.util.Scanner;

public class ReverseWordsOfString {

    public static String reverse(String strs)
    {
        String words[]=strs.split(" ");
        for(int i=0;i<words.length;i++)
        {
            String result=new StringBuilder(words[i]).reverse().toString();
            words[i]=result;
        }

        return  String.join(" ",words);

    }



    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverse(str));
    }
    
}
