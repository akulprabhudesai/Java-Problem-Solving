import java.util.ArrayList;

class Solution{
    public static void main(String args[]){
        int[] nums = new int[] {1,2,3};
    	
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
       for(int i = 0; i <= nums.length;i++){
        cal(res,cur,nums,0, i);  
        } 
        System.out.println(res);
    }
    
    public static void cal(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> cur, 
    		int[] nums, int start, int len){
       if(len == 0){
           res.add(new ArrayList<Integer>(cur));
           start = nums.length + 1;
       }
       else if( cur.size() == len){
           res.add(new ArrayList<Integer>(cur));  
           cur.remove(cur.size() -1);
           return;
        }
       else if(start == nums.length)cur.remove(cur.size()-1);
        for(int i = start; i < nums.length;i++){
            cur.add(nums[i]);
           // System.out.println(cur);
            cal(res, cur, nums, i+1, len);
            if(i == nums.length-1 && cur.size() > 0){
                cur.remove(cur.size()-1);
            }
        }
       
    }
}