import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class odd_even_string {

    public static void main(String[] args) {
        Scanner scanner_int = new Scanner(System.in);
        Scanner scanner_str = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        String currentString;
        int T = scanner_int.nextInt();
        scanner_int.nextLine();
        
        for (int i=0;i<T;i++)
           list.add(scanner_int.nextLine());
        
        for (int i=0;i<T;i++)
        {
            currentString = list.get(i);
            //Char [] even = new char[];
            //Char [] odd = new char[];
            for(int j = 0; j < currentString.length(); j = j + 2){
                System.out.print(currentString.charAt(j));
            }
            System.out.print(" ");
            for(int j = 1; j < currentString.length(); j = j + 2){
                System.out.print(currentString.charAt(j));
            }
            System.out.print("\n");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
   
            
}