class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
      
       
       for(int row = 0; row<numRows; row++){
         List<Integer> cur = new ArrayList<>();// it should get reset at every loo
        long ans = 1;
        cur.add((int)ans);
          for(int c = 1; c<=row; c++){
            ans = ans * (row-c+1)/c;
            cur.add((int)ans);
            
          }res.add(new ArrayList<>(cur));
       }  return res;
    }
}