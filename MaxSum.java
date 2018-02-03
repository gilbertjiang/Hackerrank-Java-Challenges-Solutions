import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    	int max = 0;
    	
    	int[] myArray = list.stream().mapToInt(i->i).toArray();
    	//myArray = list.toArray(int);
    	
    	for (int i=0;i<list.size(); i++)
    	{
    		int a = myArray[i];
    		for (int j=0; j<list.size(); j++)
    		{
    			if (j!=i)
    			{
    				if (max < a + myArray[j])
    				{
    					max = a+myArray[j];
    				}
    			}
    		}
    	}
    	return max;
    }
    
    public static int findMaxSum2(List<Integer> list) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    	int max = 0;
    	
    	//int[] myArray = list.stream().mapToInt(i->i).toArray();
    	
    	Collections.sort(list, Collections.reverseOrder());
    	
    	return list.get(0)+list.get(1);
    }
    
    public static int findMaxSum3(List<Integer> list) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    	int maxOne = 0;
        int maxTwo = 0;
        for(int i=0;i<list.size();i++){
            if(maxOne < list.get(i)){
                maxTwo = maxOne;
                maxOne =list.get(i);
            } else if(maxTwo < list.get(i)){
                maxTwo = list.get(i);
            }
        }
    	
    	return maxOne + maxTwo;
    }
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 34, 7, 11);
        System.out.println(findMaxSum3(list));
    }
}