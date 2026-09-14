class Solution {

private void perms(int[] nums,int idx,List<List<Integer>> res){
    if(idx == nums.length){
         List<Integer> cur = new ArrayList<>();
        for(int num : nums){
         cur.add(num);}
          res.add(cur);
         return; 
        
 }

Set<Integer> seen = new HashSet<>();
     for(int i = idx; i<nums.length; i++){
      if(seen.contains(nums[i])){
        continue;
      }
        seen.add(nums[i]);

      swap(nums,idx,i);
      perms(nums,idx+1,res);
      swap(nums,idx,i); }
}

    private void swap(int[] nums,int idx, int i){
        int temp = nums[idx];
        nums[idx] = nums[i];
        nums[i] = temp;
    }


    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        perms(nums,0,res);
        return res;
    }
}