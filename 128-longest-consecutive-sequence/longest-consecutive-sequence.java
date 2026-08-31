class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
         int maxcount = 0;int count = 0;
          if( n == 0){
                return 0;
             }

        for(int i = 0; i< n -1; i++){
            
            if(nums[i+1] - nums[i] == 1){
                count++;
                maxcount = Math.max(maxcount,count);
            }
            else if(nums[i+1] - nums[i] == 0) {
                
                continue;
            }
            else{
                count = 0;
            }
        } return maxcount + 1;
    }
}