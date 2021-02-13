class Solution {
    public static void main(String args[]){
	int n = 4; //you can change the value on n
 	int k = 3; // you can change the value of k
      
       ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
       ArrayList<Integer> cur = new ArrayList<Integer>();
       
       combine(n,1,k,0,res,cur);
       System.out.println(res);
    }
    
    public static void combine(int n,int start, int k, int size, ArrayList<ArrayList<Integer>> res, 
         ArrayList<Integer> cur){
      if(size == k){
          res.add(new ArrayList<Integer>(cur));
          cur.remove(cur.size()-1);
          return;
      }
      if(start == n + 1) {
          cur.remove(cur.size()-1);
          return;
      }
        
      for(int i = start; i <= n;i++){
          cur.add(i);
        
          combine(n,i+1,k,size + 1,res,cur);
          
           if(i  == n && cur.size() != 0){
              cur.remove(cur.size()-1);    
           } 
        } 
    } 
}