class Solution {
       private int rowindex(int[][] mat,int row,int col,int mid){
          int maxvalue = -1;
          int index = -1;
          for(int i = 0; i<row; i++){
            if(mat[i][mid] > maxvalue){
                maxvalue =  mat[i][mid];
                index = i;
            }
          }
          return index;
       }


    public int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int left = 0; int right = col - 1;
         while(left <= right){
            int mid = left + (right - left)/2;
            int maxrowindex = rowindex(mat,row,col,mid);
            int low = mid - 1 >= 0 ? mat[maxrowindex][mid-1] : -1;
            int high = mid + 1 < col? mat[maxrowindex][mid + 1] : -1;
            if(mat[maxrowindex][mid] > low && mat[maxrowindex][mid] > high){
                return new int[]{maxrowindex,mid};
            }
            else if(mat[maxrowindex][mid] < low){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
         }
        return new int[]{-1,-1};
    }
}