import java.io.*;
import java.util.*;

public class StringToken {

    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        // Write your code here.
        
        String s = "                        ";
//        s = s.replaceAll(",", " ");
//        s = s.replaceAll("'", " ");
//        s = s.replaceAll("\\?", " ");
//        s = s.replaceAll("\\.", " ");
//        s = s.replaceAll("_", " ");
//        s = s.replaceAll("@", " ");
//        s = s.replaceAll("!", " ");
//        s = s.replaceAll("\\s+", " ");
        s = s.trim();
        String[] myStringArray = s.trim().split("[ !,?.\\_'@]+");
        
        if(s.length() == 0){
            System.out.println("0");
        }
        else if (s.length() <= 400000 && s.length()>0)	
        {
//        	int count = 0;
//            for (int i=0; i<myStringArray.length; i++)
//            {
//            	if (myStringArray[i] == " ")
//            		count++;
//            	//System.out.println(myStringArray[i]);
//
//            }
            
            System.out.println(myStringArray.length);
            for (int i=0; i<myStringArray.length; i++)
            {
            	//if (myStringArray[i] != " ")
            		System.out.println(myStringArray[i]);
            }
            
//            if (myStringArray[0]=="\n")
//            	System.out.println("found it "+myStringArray[0]);
        }
        
    }
}