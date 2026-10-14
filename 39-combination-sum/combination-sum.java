class Solution {
       private void comb(int[] candidates,int i,int target,List<List<Integer>> res,List<Integer> cur){
         
        if(i == candidates.length || target<0){ 
            return;
        }
        if(target == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
 
        cur.add(candidates[i]);
        comb(candidates,i,target - candidates[i],res,cur);
        cur.remove(cur.size()-1);

        comb(candidates,i+1,target,res,cur);
       }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        comb(candidates,0,target,res,cur);
        return res;
    }
}