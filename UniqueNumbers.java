import java.util.Collection;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.*;

public class UniqueNumbers {
	public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers)
	{
		//throw new UnsupportedOperationException("Waiting to be implemented");
		List<Integer> output = new ArrayList<Integer>();
		int size = numbers.size();
		Iterator<Integer> iter = numbers.iterator();
		
		for (int i=0;i<size;i++)
		{
			Integer temp = iter.next();
			if (output.contains(temp))
			{
				;
			}
			else
				output.add(temp);
		}
		return output;
		
	}
	
	public static Collection<Integer> findUniqueNumbers2(Collection<Integer> numbers)
	{
		//throw new UnsupportedOperationException("Waiting to be implemented");
		List<Integer> deduped = numbers.stream().distinct().collect(Collectors.toList());
		
		List<Integer> output = new ArrayList<Integer>();
		int size = numbers.size();
		Iterator<Integer> iter = numbers.iterator();
		
		int result = 0;
		for (int i=0;i<size;i++)
		{
			Integer temp = iter.next();
			result ^= temp;
		}
		
		return deduped;
		
	}
	
	public static Collection<Integer> findUniqueNumbers3(Collection<Integer> numbers)
	{
		List<Integer> output = new ArrayList<Integer>();
		
		Integer [] myArray = numbers.toArray(new Integer[numbers.size()]);
		
	}
	
	public static int lonelyInteger(int [] array) {
	    int val = 0;
	    for (int num : array) {
	        val = val ^ num; // ^ is XOR operator
	    }
	    return val;
	}
	
	public static void main(String[] args)
	{
		Collection<Integer> numbers = Arrays.asList(1,2,1,3,3,3,4,5);
		for (int number: findUniqueNumbers3(numbers))
		{
			System.out.println(number);
		}
	}
}
