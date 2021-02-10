class Solution {
    
public static void main(String[] args){

int[] nums = new int[]{3,2,1,0,4};   //you can change input elements
System.out.println(canJump(nums));
}

public static boolean canJump(int[] nums) {
      if(nums.length == 1)return true;
      int step = 1;
      
        for(int i = nums.length-2; i >=0; i--){
            if(i == 0 && nums[i] >= step)return true;
            else{
               if(nums[i] >= step){
                   step = 1;
                   continue;
               }
               if(nums[i] < step)step++; 
            }
        }
        return false;
    }
}