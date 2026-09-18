class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0; int right = 1;
        if(n == 1) return nums[0];
        while(left<right && right<n){
            if(nums[left] != nums[right]){
                return nums[left];
            }
            left+=2;
            right+=2;
        } return nums[n-1];
    }
}