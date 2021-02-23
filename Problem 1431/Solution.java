class Solution{

	public static void main(String args[]){
		int[] candies = new int[]{2,3,5,1,3};
		int extraCandies = 3;
		int large = -1;
        	List<Boolean> res = new ArrayList<Boolean>();
        	for(int i = 0; i < candies.length;i++){
            		if(candies[i] > large)large = candies[i];
        	}
        
        	for(int i = 0; i < candies.length;i++){
            		if((candies[i] + extraCandies) >= large)res.add(i, true);
            		else res.add(i, false);
        	}
        
        	 System.out.println(res);
		
        
	}

}