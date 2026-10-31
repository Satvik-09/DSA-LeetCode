class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
         int ans = 0;
         int xor = 0;
          for(int num : nums){
            ans ^= num;
          }

          int mask = ans & -ans;

          for(int num : nums){
            if((num & mask) != 0){
                xor ^= num;
            }
          }

          int second = ans ^ xor;

          return new int[]{xor,second};
    }
}