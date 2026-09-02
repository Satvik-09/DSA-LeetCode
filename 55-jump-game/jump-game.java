class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxreach = 0;

        for(int i =0; i< n; i++){
            if(i>maxreach){
                return false;
            }
            maxreach = Math.max(maxreach,i+nums[i]);
        }
        return true;
    }
}