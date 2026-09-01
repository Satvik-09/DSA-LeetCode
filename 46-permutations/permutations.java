class Solution {

 private void perms(int[] nums,List<Integer> cur,List<List<Integer>> res){
    // Base case
    if(cur.size() == nums.length){
        res.add(new ArrayList<>(cur));
        return;
    }
    // to add each element and backtrack 
    for(int i = 0; i<nums.length;i++){
        if(cur.contains(nums[i])) continue;
        cur.add(nums[i]); // choose
        perms(nums,cur,res); // explore
        cur.remove(cur.size()-1); // unchoose
    }
    
 }
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();
    perms(nums,new ArrayList<>(),res);
    return res; }
}