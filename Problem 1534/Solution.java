class Solution {
    public static void main(String args[]){
	int [] arr = new int[]{3,0,1,1,9,7};
	int a = 7;
	int b = 2;
	int c = 3;
	System.out.println(countGoodTriplets(arr, a, b, c));
}
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
       int ret = 0;
        for(int i = 0; i < arr.length -2;i++){
            for(int j = i+1; j < arr.length-1;j++){
                for(int k = j+1; k < arr.length;k++){
                  
                if(Math.abs(arr[i] - arr[j]) <= a &&
              Math.abs(arr[j] - arr[k]) <= b &&
              Math.abs(arr[i] - arr[k]) <= c) ret++;
                }
                
            }
            
        } 
        return ret;
    }

}