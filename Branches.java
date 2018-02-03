public class Branches {
    
    public static int count2(int[] tree) {
        
    	boolean[] seen = new boolean[tree.length];
    	int notLeaves = 0;
    	
    	for (int i = 0; i< tree.length; i++)
    	{
    		if (tree[i] == -1)
    		{
    			continue;
    		}
    		if(!seen[tree[i]])
    		{
    			seen[tree[i]] = true;
    			notLeaves++;
    		}
    	}
    	
    	return notLeaves;
    }
    
    public static void main(String[] args) {
        //System.out.println(Branches.count2(new int[] {1, 3, 1, -1, 3}));
    	System.out.println(Branches.count2(new int[] {1, 4, 0, 2, -1}));
    }
}