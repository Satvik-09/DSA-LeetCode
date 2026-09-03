class Solution {
    public int firstMissingPositive(int[] nums) {
       int n = nums.length;
       // pass 1 : swapping and sorting occurs V placed at V-1 index
       for(int i = 0; i<n; i++){
            while(nums[i]>0 && nums[i] <= n && nums[nums[i]-1] != nums[i]){
                int current = nums[i] - 1;//current is a index
                int temp = nums[current];
                nums[current] = nums[i];
                 nums[i] = temp;  
            }
       }
             // pass 2 : to check whether V = V+1 [v should be equal to v+1]
             for(int i =0; i<n; i++){
                if(nums[i] != i+1){
                    return i+1;
                }
             }
        return n+1;//all the elements are in sorted order so missing element is    n+1     
    }
}