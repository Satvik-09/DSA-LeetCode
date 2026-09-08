class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length; int maxcount = 0;
        int zerocount = 0; int left = 0;
       for(int r = 0; r<n; r++){
        if(nums[r] == 0){
            zerocount += 1;
        }
        if(zerocount > k){
            if(nums[left] == 0){
            zerocount -= 1; }
            left++;
        }
        maxcount = Math.max(maxcount,r-left+1);
       } return maxcount;
    }
}