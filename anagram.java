import java.io.*;
import java.util.*;

public class anagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
    	
    	boolean output = false;
    	
    	//char myChar = 'a';
    	//char otherChar = 'b';
    	  	
    	char[] charArrayA = a.toLowerCase().toCharArray();
    	char[] charArrayB = b.toLowerCase().toCharArray();
    	    	
    	HashMap<Character,Integer> hmA = new HashMap <Character,Integer>();  
    	HashMap<Character,Integer> hmB = new HashMap <Character,Integer>();
    	
      	for (int i=0; i<charArrayA.length;i++)
    	{
    		if (hmA.get(charArrayA[i])!=null)
    		{
    			hmA.put(charArrayA[i],hmA.get(charArrayA[i])+1);
    			System.out.println(charArrayA[i] + ": " + hmA.get(charArrayA[i]));
    		}
    		else
    			hmA.put(charArrayA[i],1);
    	}
    	
    	for (int i=0; i<charArrayB.length;i++)
    	{
    		if (hmB.get(charArrayB[i])!=null)
    		{
    			hmB.put(charArrayB[i],hmB.get(charArrayB[i])+1);
    			System.out.println(charArrayB[i] + ": " + hmB.get(charArrayB[i]));
    		}
    		else
    			hmB.put(charArrayB[i],1);
    	}
    	    	
    	if (hmA.equals(hmB))
    		output = true;
    	
    	return output;
    }
    
    public static void main(String[] args) {
        
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
    	
    	String a = "hellols";
    	String b = "HlelolS";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
	
	
	
}
