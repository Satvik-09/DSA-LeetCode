class Solution {
    public boolean isValidSudoku(char[][] board) {
      
      for(int r = 0; r<9; r++){
        boolean[] seen = new boolean[10];

        for(int c = 0; c<9;c++){
            char num = board[r][c];

            if(num == '.'){
                continue;
            }

        int digit = num - '0';

        if(seen[digit]){
            return false;
        }
        seen[digit] = true;
        }
      }
      
      for(int c = 0; c < 9; c++){
        boolean[] seen = new boolean[10];

        for(int r = 0; r < 9; r++){
            char num = board[r][c];

            if(num == '.') continue;
            
            int digit = num - '0';

            if(seen[digit]){
                return false;
            }
         seen[digit] = true;
        }
      }

      for(int br = 0; br < 9; br+=3){
        for(int bc = 0; bc<9; bc+=3){
            boolean[] seen = new boolean[10];

            for(int r = br; r < br + 3; r++){
                for(int c = bc; c<bc + 3; c++){
                    char num = board[r][c];

                    if(num == '.'){
                        continue;
                    }

                    int digit = num - '0';

                    if(seen[digit]){
                        return false;
                    }
                    seen[digit] = true;
                }
            }
        }
      }
      return true;
    }
}