class Solution {
    public int jump(int[] nums) {
        int n = nums.length; int current =0;
        int count = 0; int maxreach = 0;
          for(int i =0; i<n-1;i++){
            
            maxreach = Math.max(maxreach,i+nums[i]);

            if(i == current){
                current = maxreach;
                count++;
            }
            else 
            if(current >= n-1){
                break;
            }
          } return count;
    }
}