import java.io.*;
import java.util.*;

public class palindrone {

    public static void main(String[] args) {
        
        //Scanner sc=new Scanner(System.in);
        //String A=sc.next();
    	
    	String A = "aabaa";
        /* Enter your code here. Print output to STDOUT. */
        
        char[] myCharArray = A.toCharArray();
        
        int size = myCharArray.length;
        
        String output = "Yes";
        //System.out.println("size/2: " + size/2);
        
        for (int i=0;i<(size)/2; i++)
        {
        	if (myCharArray[i]!=myCharArray[size-i-1])
        	{
        		//System.out.println("i: " + myCharArray[i] + "size-i-1: " + myCharArray[size-i-1]);
        		//System.out.println("No");
        		output = "No";
        	}
        }
        System.out.println(output);
        
    }
}
