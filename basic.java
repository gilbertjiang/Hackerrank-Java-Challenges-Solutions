import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class basic {
	public static void main(String[] args)
	{
		//Scanner scan = new Scanner(System.in);
		// short form
		int [] arr = {1,2,3,4,5};
		
		// declare array
		int [] array1;
		// allocate memory
		array1 = new int [10];
		array1[0] = 1;
		array1[1] = 100;
		
		for (int i=0;i<array1.length;i++)
		{
			array1[i] = 100*i; 
		}
		
		// string
		String s = "hello ";
		String s_1 = "";
		
		//s_1=scan.nextLine();
		
		int a=-400;
		int b= 1;
		int [] array_1;
		array_1 = arr;
		
		System.out.println(arr[1]);
		System.out.println(array1[9]);
		//System.out.println(s+s_1);
		System.out.println(array_1);
		System.out.println(arr);
	}
}
