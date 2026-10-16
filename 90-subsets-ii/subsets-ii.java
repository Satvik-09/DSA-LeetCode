class Solution {
        private void subs(int[] nums,int i,List<Integer> cur,List<List<Integer>> res){
            if(i == nums.length){
                res.add(new ArrayList<>(cur));
                return;
            }
            

            cur.add(nums[i]);
            subs(nums,i+1,cur,res);
            cur.remove(cur.size() - 1);
            while(i+1 < nums.length && nums[i + 1] == nums[i]){ i++;}
            subs(nums,i+1,cur,res);
            
        }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        subs(nums,0,cur,res);
        return res;
    }
}