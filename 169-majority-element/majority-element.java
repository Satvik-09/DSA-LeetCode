class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length; int count = 0;
        int left = nums[0]; int mxcount = 0;
        for(int i = 0; i<n; i++){ 
      if(count == 0){
        mxcount = nums[i];
      }
      count += (nums[i]==mxcount)?1:-1;
    } return mxcount;
    }
}