class Solution {
         private boolean mindays(int[] weights, int days,int limit ){
          int daysneed = 1; int load = 0;
          for(int x : weights){
            if(load + x > limit){
                daysneed++;
                load = x;
            }
            else{
                load += x;
            }
            
          }
          return daysneed <= days;
         }
    public int shipWithinDays(int[] weights, int days) {
        int left = 1; int right = 0;
        for(int w : weights){
            right += w;
            left = Math.max(left,w);
        }
        
        while(left<right){
            int mid = left + (right - left) / 2;
            if(mindays(weights,days,mid)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}