import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class lexi {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
              
        int size = s.length();
        char[] myCharArray = s.toCharArray();
        
        largest = "A";
        smallest = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        char[] newChar = new char[k];
        
        for (int i = 0; i<size-k+1; i++ )
        {	
          	for (int j=0; j<k; j++)
        	{
        		newChar[j] = myCharArray[i+j];
        		//System.out.println("array element " + newChar[j]);
        	}

        	String currentString = new String(newChar);

        	if (currentString.compareTo(largest) > 0)
        		largest = currentString;
        	
        	if (currentString.compareTo(smallest) < 0)
        		smallest = currentString;
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        String s = "hello";
        int k = 3;
        //scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}