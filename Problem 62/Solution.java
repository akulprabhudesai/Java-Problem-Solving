class Solution {
    
public static void main(String args[]){

int m = 3;
int n = 7;

System.out.println(uniquePaths(m,n));
}


public static int uniquePaths(int m, int n) {
     int[][] matrix = new int[m][n];
        
        for(int c = 0; c < matrix[0].length;c++){
            matrix[0][c] = 1;
        }
        for(int r = 0; r < matrix.length;r++)matrix[r][0] = 1;
        
        for(int r = 1; r < matrix.length; r++){
            for(int c = 1; c < matrix[0].length; c++){
                matrix[r][c] = matrix[r-1][c] + matrix[r][c-1];
            }
        }
        
        return matrix[m-1][n-1];
    }
}