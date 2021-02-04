class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
       ArrayList<Integer> res = new ArrayList<Integer>();
		int len = 0;
		HashMap<String, Integer> count = new HashMap<String, Integer>();
        
		for (int i = 0; i < words.length; i++) {
			len = len + words[i].length();
			if (count.containsKey(words[i]) == false) {
				count.put(words[i], 1);
			} else {
				count.replace(words[i], count.get(words[i]) + 1);
			}
		}
		
		
		for(int i = 0; i < s.length() - len + 1;i++) {
			String cur = s.substring(i, i + len);
			if(check(count, cur, words, words[0].length()))res.add(i);
		}
		
		return res;
	}
	
	public static boolean check(HashMap<String,Integer> count, String cur,String[] words, int l) {
		HashMap<String, Integer> word = new HashMap<String, Integer>();
		for (int i = 0; i < cur.length() - l +1; i=i + l) {
			if(count.containsKey(cur.substring(i,i+l)) == false)return false;
            
            if (word.containsKey(cur.substring(i,i+l)) == false) {
				word.put(cur.substring(i,i+l), 1);
			} else {
				
                if(word.get(cur.substring(i,i+l)) + 1 > count.get(cur.substring(i,i+l)))return false;
                word.replace(cur.substring(i,i+l), word.get(cur.substring(i,i+l)) + 1);
			}
		}
		return true;
	}
}