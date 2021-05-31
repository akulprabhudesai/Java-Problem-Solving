class Solution {

	public static void main(String[] args) {
		
		String s = "is2 sentence4 This1 a3";
		
		String[] words = s.split(" ");
        String[] temp = new String[words.length];
        
        for(int i = 0; i < words.length;i++){
            int index = Character.getNumericValue(words[i].charAt(words[i].length() -1));
            temp[index-1] = words[i].substring(0, words[i].length()-1);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < words.length;i++){
            sb.append(temp[i]);
            if(i != words.length -1)sb.append(" ");
        }
        
        
		System.out.println(sb.toString());
		
	}

}