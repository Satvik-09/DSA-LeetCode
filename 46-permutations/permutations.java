class Solution { 
         private void perms(int[] nums, int idx,List<Integer> cur,List<List<Integer>> res){
             
            if(cur.size() == nums.length){
                res.add(new ArrayList<>(cur));
                return;
            }
           
            for(int i = 0; i<nums.length;i++){
                  if(cur.contains(nums[i])){
                    continue; }
                cur.add(nums[i]); // choose
                perms(nums,i+1,cur,res); // explore
                cur.remove(cur.size()-1); // unchoose or backtraack
                
                  
            }
         }



    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        perms(nums,0,cur,res);
        return res;
    }
}