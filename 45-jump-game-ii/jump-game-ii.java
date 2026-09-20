class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int current = 0;
        int maxreach = 0;
        int count = 0;
        if(n == 1) return count;
        for(int i = 0; i<n; i++){
            maxreach = Math.max(maxreach,i+nums[i]);
            if(i == current){
                count++;
                current = maxreach;
            }

            if(current >= n-1){
                break;
            }
        }
        return count;
    }
}