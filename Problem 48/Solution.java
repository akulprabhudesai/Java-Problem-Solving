class Solution{

    public static void main(String[] args){
    int[][] matrix = { {1,2,3},{4,5,6},{7,8,9} }; //you can change the input
    rotate(matrix);
}
    public static void rotate(int[][] matrix) {
        
   for(int row = 0; row < matrix.length;row++){
       for(int col = row + 1; col < matrix.length;col++){
           int temp = matrix[row][col];
           matrix[row][col] = matrix[col][row];
           matrix[col][row] = temp;
       }
   }
        
        for(int start = 0;start < matrix.length /2;start++){
           for(int row = 0; row < matrix.length;row++){
                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][matrix.length-1-start];
                matrix[row][matrix.length-1-start] = temp;
             }   
        }
	
	//print the array to get final ans

	 for(int row= 0;row < matrix.length;row++){
           for(int col = 0; col < matrix.length;col++){
                System.out.print(matrix[row][col] + " ");
             }
		System.out.println("");   
        } 
    }
}