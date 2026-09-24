class Solution {
      private long divisor(int[] nums, int k){
        long h = 0;
        for(int num : nums){
            h += (num + (long) k-1)/k;
        }
        return h;
      }

    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1; int right = 0;
        for(int i = 0; i<nums.length; i++){
            right = Math.max(right,nums[i]);
        }
        int ans = right;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(divisor(nums,mid) <= threshold){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}