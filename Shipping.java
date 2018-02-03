public class Shipping {
	public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages){
		// to implement
		int output = 0;
		int numSmall = 0;
		int numBig = 0;
		int remainder = 0;
		
		if (availableLargePackages*5 + availableSmallPackages < items)
			return -1;
		else
		{
			if (items>5)
			{
				remainder = items/5;
				if (remainder <= availableLargePackages)
				{
					numSmall = items-5*remainder;
					numBig = (items-numSmall)/5;
					output = numSmall+numBig;
				}
				else
				{
					numBig = availableLargePackages;
					numSmall = items-5*numBig;
					output = numSmall + numBig;
				}
			}
			else
				output = items;
			return output;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(minimalNumberOfPackages(26,3,10));
	}
}
