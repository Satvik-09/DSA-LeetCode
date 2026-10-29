class Solution {
    public int singleNumber(int[] nums) {
      int n = nums.length;
      Arrays.sort(nums);

      for(int i = 0; i<n-2; i+=3){
        if(nums[i] != nums[i+1]){
            return nums[i];
        }
      }
      return nums[n-1];
    }
}