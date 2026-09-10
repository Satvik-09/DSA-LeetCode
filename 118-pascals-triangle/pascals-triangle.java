class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
       
          for(int row = 0; row < numRows; row++){
              List<Integer> cur = new ArrayList<>();
            for(int col = 0; col<=row; col++){
                if(row == col || col == 0){
                    cur.add(1);
                }
                else{
                    List<Integer> prevrow = new ArrayList<>();
                    prevrow = res.get(row-1);
                    int value = prevrow.get(col-1) + prevrow.get(col);
                    cur.add(value);
                }
            } res.add(cur);
          } return res;
    }
}