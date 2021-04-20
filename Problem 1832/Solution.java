class Solution {
    public static void main(String[] args){
	String sentence = "thequickbrownfoxjumpsoverthelazydog";

	System.out.println(checkIfPangram(sentence));
}
    public static boolean checkIfPangram(String sentence) {
        int[] nums = new int[26];
        
        for(char ch : sentence.toCharArray()){
            nums[ch - 'a']++;
        }
        
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 0)return false;
        }
        return true;
    }
}