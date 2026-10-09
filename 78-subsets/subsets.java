class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        solve(nums,0,new ArrayList<>());
        return res;
    }

    private void solve(int[] nums,int i,List<Integer> path){
        if(i == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }

        path.add(nums[i]);
        solve(nums,i+1,path);

        path.remove(path.size()-1);

        solve(nums,i+1,path);
    }
}