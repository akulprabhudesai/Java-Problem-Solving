class Solution {
    public static void main(String args[]){
    int[][] image = { {1,1,0}, {1,0,1}, {0,0,0} };
    image = flipAndInvertImage(image);  

    for(int r = 0; r < image.length;r++){
	for(int c = 0; c < image[r].length;c++){
	System.out.print(image[r][c] + " ");
	}
	System.out.println();
    }
}
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int r = 0; r < image.length;r++){
            int start = 0;
            int end = image[0].length-1;
            while(start < end){
             int temp = image[r][start];
             image[r][start] = image[r][end];
             image[r][end] = temp;
            if(image[r][start] == 0)image[r][start] = 1;
            else if(image[r][start] == 1)image[r][start] = 0;
            
             if(image[r][end] == 0)image[r][end] = 1;
             else if(image[r][end] == 1)image[r][end] = 0;
                start++;
                end--;
            }
            if(start == end){
               if(image[r][start] == 0)image[r][start] = 1;
               else if(image[r][start] == 1)image[r][start] = 0;
            }
            
        }
        return image;
    }
}