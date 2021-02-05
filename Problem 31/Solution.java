class Solution {
    public void nextPermutation(int[] nums) {
        
        boolean isreverse = true;
        for(int i = 0; i < nums.length-1;i++) {
			if(nums[i] < nums[i+1]) {
				calculate(nums);
                isreverse = false;
				break;
			}
		}
        if(isreverse)sort(nums,0,nums.length - 1);
    }
    
    public static void calculate(int[] nums) {
		for(int i = nums.length-1;i >0;i--) {
			if(nums[i-1] < nums[i]) {
				int pos = i;
				int cur = nums[i];
				for(int j = i;j < nums.length;j++) {
					if(nums[j] < cur && nums[j] > nums[i-1])pos = j;
				}
				cur = nums[pos];
				nums[pos] = nums[i-1];
				nums[i-1] = cur;
				sort(nums, i, nums.length-1);
				break;
			}
		}
		return;
	}
    
    static void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    static void sort(int arr[], int l, int r){
        if (l < r) {
            int m =l+ (r-l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

	
}