class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
         int left = 0; int top = 0; 
         int right = n-1; int bottom = n-1;
         int num = 1;
         while(left <= right && top <= bottom){
            for(int col = left; col <= right; col++){
                mat[left][col] = num;
                num++;
            }
            top++;

            for(int row = top; row <= bottom; row++){
                mat[row][right] = num;
                num++;
            }
            right--;
            
            if(top <= bottom){
            for(int col = right; col >= left; col--){
                mat[bottom][col] = num;
                num++;
            }
            bottom--;
            }
            if(left <= right){
                for(int row = bottom; row >= top; row--){
                    mat[row][left] = num;
                    num++;
                }
                left++;
            }
         }
         return mat;
    }
}