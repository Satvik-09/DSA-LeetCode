class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        for(int i=n-2; i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot != -1){
            for(int j =n-1; j>pivot;j--){
                if(nums[j] > nums[pivot]){
                int temp = nums[j];
                nums[j] =nums[pivot];
                nums[pivot] = temp;
                break;
                }
            }
        }
            reverse(nums,pivot+1,n-1);
    }

    private void reverse(int[] nums, int left, int right){
        while(left< right){
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
            left++;
            right--;
        }
    }
}