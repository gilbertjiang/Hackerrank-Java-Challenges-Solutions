//import java.util.*;

public class RemoveRepetitions {
    public static String transform(String input) {
        input = input + ".";

        char[] myArray = input.toCharArray();
        //List<Character> ans1 = new ArrayList<Character>();
        
        String ans=""; // Variable to store the final result
        int L = input.length();
 
        for(int i=0; i<L-1; i++)
        {
            if(myArray[i]!=myArray[i+1])
            {
                ans = ans + myArray[i];
                //ans1.add(myArray[i]);
            }
        }
        return ans;
    }
    
    public static String transform2(String input) {
        char[] myArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        char temp = 0;
        for(char c : myArray)
        {
            if(c!=temp)
            {
                sb.append(c);
                temp = c;
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(RemoveRepetitions.transform2("  00abbcbbbdd   .."));        
    }
}