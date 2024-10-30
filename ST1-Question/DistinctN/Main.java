import java.util.*;


public class Main {
    public static Integer findNthRepeatedElement(int[] arr, int n) 
    {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int num : arr) 
        {
            if(!hs.containsKey(num))
            {
                hs.put(num,1);
            }
            else
            {
                int val=hs.get(num);
                hs.put(num,val+1);
            }
        }

        
        ArrayList<Integer> repeated = new ArrayList<>();

        for (Integer key:hs.keySet()) 
        {
            if(hs.get(key)>1)
            {
              repeated.add(key);
            }
        }

        // Step 3: Check if the Nth repeated element exists
        if (n <= 0 || n > repeated.size()) 
        {
            return null;  // Or throw an exception, or return a special value
        }

        // Return the Nth repeated element
        return repeated.get(n - 1); // n-1 because of zero-based indexing
    }

    public static void main(String[] args) 
    {
        int[] arr = {4, 5, 6, 7, 4, 8, 6, 9, 4, 6};  // Example array
        int n = 2;  // Example: find the 2nd repeated element

        Integer result = findNthRepeatedElement(arr, n);
        if (result != null) {
            System.out.println("The " + n + "th repeated element is: " + result);
        } else {
            System.out.println("There is no " + n + "th repeated element.");
        }
    }
}
