class Solution {
     private long hrs(int[] piles,int h){
        long hours = 0;
      for(int pile : piles){
        hours += (pile + (long) h-1)/h;
      }
      return hours;
     }

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1; int right = 0;
        for(int i = 0; i<piles.length;i++){
            right = Math.max(piles[i],right);
        }
        int ans = right;
        while(left<=right){
           int mid = left + (right - left)/2;
           if(hrs(piles,mid) <= h){
            ans = mid;
            right = mid - 1;
           }
           else{
            left = mid + 1;
           }
        }
        return ans;
    }
}