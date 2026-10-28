class Solution {
  private  boolean isSafe(int n, int row,int col,char[][] board){
    for(int r = row - 1; r >= 0; r--){
        if(board[r][col] == 'Q') return false;
    }

    for(int r = row - 1,c = col - 1; r >=0&&c>=0;r--,c--){
        if(board[r][c] == 'Q') return false;
    }
    
    for(int r = row - 1, c = col + 1; r >= 0 && c < n; r--,c++){
        if(board[r][c] == 'Q') return false;
    }
    return true;
  }


   private void nqueen(int n,int row,char[][] board,List<List<String>> res){
           if(row == n){
            List<String> cur = new ArrayList<>();
            for(char[] r : board){
                cur.add(new String(r));
            }
            res.add(new ArrayList<>(cur));
            return;
           }

        for(int col = 0; col < n; col++){
          if(isSafe(n,row,col,board))
          {
            board[row][col] = 'Q';
            nqueen(n,row+1,board,res);
            board[row][col] = '.';
          }
           }
   }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
         char[][] board = new char[n][n];
         for(char[] r : board){ Arrays.fill(r,'.');
         }
        nqueen(n,0,board,res);
        return res;
    }
}