
public class reference {
	public static void main(String[] args)
	{
		int []arr1 = {1,2,3,4};
		int []arr2 = boo(arr1);
		
		System.out.println(arr1);
		System.out.println(arr2);
	}
	
	public static int[] boo (int[] input)
	{
		int []output = input;
		return output;
	}
}
