class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
      List<Integer> cur = new ArrayList<>(m*n);
      int left = 0; int top = 0; int right = n-1; int bottom  = m - 1;
      while(left<=right && top <= bottom){

          for(int col = left; col <=right; col++){
            cur.add(matrix[left][col]);
          }
          top++; // once reached right end top goes down by 1

          for(int row = top; row<=bottom; row++){
            cur.add(matrix[row][right]);
          }
          right--; // once reached bottom right moves inward 

          if(top<=bottom){
            for(int col = right; col>=left; col--){
                cur.add(matrix[bottom][col]);
            }
            bottom--;

            if(left<=right){
                for(int row = bottom; row >= top; row--){
                    cur.add(matrix[row][left]);
                }
                left++;
            } 
          }
      }
      return cur;
    }
}