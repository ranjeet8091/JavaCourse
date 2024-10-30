package Bitwise;

public class RepeatingElement {
    public static void main(String a[])
     {
        int arr[]={1,2,3,4,5,6,2};
        int n=arr.length;

        int xorArray=0;
        for(int num:arr)
        {
            xorArray^=num;
        }
        int XorAllNumber=0;
        for(int i=1;i<=n-1;i++)
        {
          XorAllNumber^=i;
        }
        System.out.println(xorArray^XorAllNumber);

     }

}
