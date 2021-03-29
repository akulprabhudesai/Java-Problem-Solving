class Solution {
    
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            List<List<Integer>> res = new ArrayList<>();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            check(res, temp, graph, 0, graph.length-1);
        return res;
    }
     
    public void check(List<List<Integer>> res,ArrayList<Integer> temp, int[][] graph, int node, int target ){
        if(node == target){
            temp.add(node);
            res.add(new ArrayList<Integer>(temp));
            temp.remove(temp.size() -1);
            return;
        }    
        temp.add(node);
        for(int cur : graph[node]){
            check(res, temp, graph, cur, target );
            
        } 
        if(temp.size() > 0)temp.remove(temp.size() -1);
    }
}