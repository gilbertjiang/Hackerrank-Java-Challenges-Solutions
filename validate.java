import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validate {
	public static void main(String [] args){
		System.out.println(validateUser(""));
		//String username = "d1";
		//System.out.println(username.matches("^[a-zA-Z][a-zA-Z0-9]+$"));
		
		//regex appraoch
//		1) \\d{1,2} catches any one or two digit number
//		2) (0|1)\\d{2} catches any three digit number starting with 0 or 1.
//		3) 2[0-4]\\d catches numbers between 200 and 249.
//		4) 25[0-5] catches numbers between 250 and 255.
		
//		System.out.println(validateIP("000.12.12.034"));
//		System.out.println(validateIP("121.234.12.12"));
//		System.out.println(validateIP("23.45.12.56"));
//		System.out.println(validateIP("00.12.123.123123.123"));
//		System.out.println(validateIP("122.23"));
//		System.out.println(validateIP("Hello.IP"));
		
		//invalid
//		System.out.println(validateIP("000.12.234.23.23"));
//		System.out.println(validateIP("666.666.23.23"));
//		System.out.println(validateIP(".213.123.23.32"));
//		System.out.println(validateIP("23.45.22.32."));
//		System.out.println(validateIP("I.Am.not.an.ip"));
//		
//		//valid
//		System.out.println(validateIP("000.12.12.034"));
//		System.out.println(validateIP("121.234.12.12"));
//		System.out.println(validateIP("23.45.12.56"));
		
		//String IP = "000.12.234.23.23";
		
		//System.out.println(IP.matches(new MyRegex().pattern));
		
		
	}
	
	public static boolean validateUser2(String username)
	{
		// the username must be at least 6 char long and not exceed 16 char
		if(username.length()>16 || username.length()<6)
		{
			//System.out.println("too many characters or too few");
			return false;
		}
			
		//the username must start with a letter, and must not end with a hyphen
		String firstLetter = Character.toString(username.toCharArray()[0]);
		if(username.endsWith("-") || !firstLetter.matches("[a-zA-Z]"))
		{
			//System.out.println("must start with letter, must not end with hyphen");
			return false;
		}
		
		// the username must contain only letters, numbers and optionally one hyphen(-)
		
		String[] myArray = username.split("-");
		// contains more than 1 hyphen
		if(myArray.length>2)
		{
			//System.out.println("more than 1 hyphen");
			return false;
		}
		// contains 1 hyphen
		else if (myArray.length==2)
		{
			if(myArray[0].matches("[a-zA-Z_0-9]+$") && myArray[1].matches("[a-zA-Z_0-9]+$"))
			{
				//System.out.println("1 hyphen");
				return true;
			}
		}
		// contains 0 hyphen
		else if (myArray.length==1)
		{
			if(myArray[0].matches("[a-zA-Z_0-9]+$"))
			{
				//System.out.println("0 hyphen");
				return true;
			}
		}
		// impossible
		else
			;
		
		// impossible
		return true;
	}
	
	public static boolean validateUser(String username) {
        boolean output = true;
		int len = username.length();
		
        if(username=="")
            return false;
        
		//case 1
		if (len<6 || len>16)
		{
			output = false;
			//System.out.println(len);
		}
		
		//case 2
		//can also use username.charAt(i);
		char[] chars = username.toCharArray();
		int dashCounter = 0;
		
		for (char c:chars)
		{
			if(!Character.isLetter(c) && !Character.isDigit(c))
				if(c=='-')
					dashCounter++;
				else
					output = false;
		}
		if (dashCounter>1)
			output = false;
		
		String firstLetter = Character.toString(chars[0]);
		
		//case 3
		if (username.endsWith("-") || !firstLetter.matches("[a-zA-Z]"))
		{
			//System.out.println("ends with hyphen or doesnt start with letter");
			output = false;
		}
		return output;
    }

	public static boolean validateIP(String IP)
	{
		String [] myArray = IP.split("\\.");
		//boolean output = false;
		
		if (myArray.length != 4)
		{
			System.out.println(IP + " leng !=4");
			System.out.println("array size " + myArray.length);
			return false;
		}
		else
			for(int i=0;i<4;i++)
			{
				//IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
				//Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
				
				if (myArray[i].toCharArray().length>3)
				{
					System.out.println(IP + " length greater than 3");
			    	return false;
				}
				char[] myCharArray = myArray[i].toCharArray();
				
				
	//			// leading 0
	//			if (myCharArray[0]=='0')
	//			{
	//				return false;
	//			}
				
				for (int j=0; j<myCharArray.length; j++)
				{
					char c = myCharArray[j];
				    if (!Character.isDigit(c))
				    {
				    	System.out.println(IP + " not digit");
				    	return false;
				    }
				    	
				}
				 
				if (Integer.valueOf(myArray[i])>255)
				{
					System.out.println(IP + " greater than 255");
					return false;
				}
			}
		return true;
	}
}

class MyRegex{
	String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
}
