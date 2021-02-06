class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashMap<Integer, HashSet> rows = new HashMap<Integer, HashSet>();
        HashMap<Integer, HashSet> cols = new HashMap<Integer, HashSet>();
        HashMap<Integer, HashSet> boxs = new HashMap<Integer, HashSet>();
       
        
        for(int i = 0; i < 9;i++){
           rows.put(i, new HashSet<Character>()); 
           cols.put(i, new HashSet<Character>());
           boxs.put(i, new HashSet<Character>());
        }
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
              
            if(board[row][col] != '.' ){
                
                if(check_row(rows, board[row][col], row))return false; 
                
                if(check_col(cols, board[row][col], col))return false;
                
                if( check_box(boxs, board[row][col], (row / 3) * 3 + (col/3)))return false;;
            }  
            }
           } 
        return true;
    }
    
    public boolean check_row(HashMap<Integer, HashSet> rows, char value, int row){
       
        if(rows.get(row).contains(value) == false){
            rows.get(row).add(value);
            return false;
            }
        return true;
    }
    public boolean check_col(HashMap<Integer, HashSet> cols, char value, int col){
      
       if(cols.get(col).contains(value) == false){
           cols.get(col).add(value);
           return false;
           }
        return true;       
    }
   public boolean check_box(HashMap<Integer, HashSet> boxs, char value, int index) {
     
      if( boxs.get(index).contains(value) == false){
              boxs.get(index).add(value);
               return false; 
           }
           return true; 
   }
}