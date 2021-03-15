class Solution {
	
	public static void main(String args[]) {
		int n = 4;
		int[][] preferences = {{1, 2, 3}, {3, 2, 0}, {3, 1, 0}, {1, 2, 0}};
		int[][] pairs = {{0, 1}, {2, 3}};
		
		System.out.println(unhappyFriends(n, preferences, pairs));
	}
    public static int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int res = 0;
        int[][] p = new int[n][n];
        for(int i = 0; i < pairs.length;i++){
            int one = pairs[i][0];
            int two = pairs[i][1];
            map.put(one,two);
            map.put(two,one);
        }
        for(int r = 0; r < n;r++){
            int val = 1;
            int loc = 0;
            while(loc < n-1){
               p[r][preferences[r][loc]] = val;
               val++;
               loc++;
            }
           
        }
        for(int i = 0; i < pairs.length;i++){
            int one = pairs[i][0];
            int two = pairs[i][1];
           if(p[one][two] > 1){
               int loc = 0;
               while(preferences[one][loc] != two){
                  int pref = preferences[one][loc];
              
               if(p[pref][one] < p[pref][map.get(pref)] && map.get(pref) != one){
                   res++;
                   break;
               } 
                   loc++;
               }
               
           }
            if(p[two][one] > 1){
               int loc = 0;
               while(preferences[two][loc] != one){
                  int pref = preferences[two][loc];
              
               if(p[pref][two] < p[pref][map.get(pref)] && map.get(pref) != two){
                   res++;
                   break;
               } 
                   loc++;
               }
           }
        }
        return res;
    }
}