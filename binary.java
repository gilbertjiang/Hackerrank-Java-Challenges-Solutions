import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class binary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String binaryString = Integer.toBinaryString(n);
        
        System.out.println(countRun(binaryString,'1'));
        //binaryString = binaryString.substring(binaryString.length() - numBits);
    }
    
    public static int countRun( String s, char c )
  {
    int maxCounter = 0;
    int counter = 0;
    if(s.charAt(0) == c)
        counter=1;
    //List<int> counter = new ArrayList<int>();
    for( int i = 1; i < s.length(); i++)
    {
      if(s.charAt(i) == c)
      {
          if (s.charAt(i-1) != c)
              counter=1;
          else
              counter++;     
      }
        
      if (counter>maxCounter)
      {
           maxCounter = counter;
      } 
      
      //else if(counter>0) break;
    }
    return maxCounter;
  }
    
}