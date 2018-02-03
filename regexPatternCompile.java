import java.util.Scanner;
import java.util.regex.*;

public class regexPatternCompile
{
	public static void main(String[] args)
	{
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String pattern = in.nextLine();
	          try
	          {
	             if (Pattern.compile(pattern) != null)
	                System.out.println("Valid");
	          }
	          catch(Exception e)
	          {
	              System.out.println("Invalid");
	          }
			  
	      }
	}
}