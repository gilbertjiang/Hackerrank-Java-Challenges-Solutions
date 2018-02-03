import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
    	
    	System.out.println("hello world");
       Scanner scanner = new Scanner(System.in);
       List<Integer> list = new ArrayList<Integer>();
       List<Integer> days = new ArrayList<Integer>();
       while (scanner.hasNextInt())
           list.add(scanner.nextInt());
        
       //list.add(scanner.nextInt());
       for (int i=list.get(0); i<=list.get(1); i++)
       {
           //System.out.print("i " + i + "\n");
           int reversedNum = 0;
           int input = i;
           while (input != 0) {
                reversedNum = reversedNum * 10 + input % 10;
                input = input / 10;   
           }
           //System.out.print("reversedNum " + reversedNum + "\n");
           if (Math.abs(i-reversedNum)%list.get(2)==0)
               days.add(i);
       }
       //int[] arr = list.toArray(new int[0]);

           System.out.print(days.size());

    }
    
    
}