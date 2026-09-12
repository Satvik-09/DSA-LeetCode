class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length; 
        int left = 2;
        for(int i = 2; i<n; i++){
            if(nums[i] != nums[left-2]){
                nums[left] = nums[i];
                 left++;
            }
            else if(nums[left-2] == nums[i]){
                continue;
            }           
            
        } return left;
    }
}