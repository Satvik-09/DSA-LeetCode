class Solution {
    public int search(int[] nums, int target) {
         int n = nums.length;
        int left = 0; int right = n-1;
        
        while(left<=right){
       if(nums[left] == target){
        return left;
       }
       else if(nums[right] == target){
        return right;
       }
       left++;right--;
        } return -1;
    }
}