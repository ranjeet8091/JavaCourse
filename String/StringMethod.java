package String;

public class StringMethod {
    public static void main(String[] arg)
    {
        // subString
        String s1="Welcome";
        String s2="Hello All";
        String s3="WELCOME";
        //System.out.println(s1.substring(2,6));

        // equal
       // System.out.println(s1.equals(s2));
        
        //Case Ignore
    //System.out.println(s1.equalsIgnoreCase(s3));

    //Concatination
    String s4=s2.concat(s3);
  //  System.out.println(s4);

    //Length

    //System.out.println(s4.length());

    // CharAt()
    System.out.println(s4.charAt(1));

    //toUpperCase()  and tolowerCase() /// this depritiate in latest version

    //indexOf()
    System.out.println(s4.indexOf("A"));  // if char is not present give the -1 

    }
}
