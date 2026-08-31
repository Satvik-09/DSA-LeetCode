class Solution {
       private void getperms(int[] nums,int idx,List<List<Integer>> res) {
        if(idx == nums.length){
            List<Integer> cur = new ArrayList<>();
            for( int num : nums){
            cur.add(num);
            }
            res.add(cur);
            return; 
        }

        for(int i = idx; i<nums.length; i++){
            swap(nums,i,idx);
            getperms(nums,idx+1,res);
            swap(nums,idx,i);
        }
       }     

        private void swap(int[] nums,int idx, int i){
            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
        }
   


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        getperms(nums,0,res);
        return res;
    }
}