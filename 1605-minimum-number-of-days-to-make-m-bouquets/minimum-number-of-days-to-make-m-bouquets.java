class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       int n = bloomDay.length;
       int left = bloomDay[0]; int right = bloomDay[0];
       for(int i = 1; i<n; i++){
        left = Math.min(left,bloomDay[i]);
        right = Math.max(right,bloomDay[i]);
       } 

       if((long)m*k > n) return -1;
       while(left < right){
        int mid = left + (right - left)/2;
        if(minbloom(bloomDay,m,k,mid)){
            right = mid;
        }
        else{
            left = mid + 1;
        }
       }
       return left;
    }


    private boolean minbloom(int[] bloomDay, int m, int k, int mid){
        int count = 0;  int bouquets = 0;
        for(int x : bloomDay){
            if(x <= mid){
                count++;
                if(count == k) {
                    bouquets++;
                    count = 0;
                }
            }
            else{
                
                count = 0;
            }
        }
        return bouquets >= m;
    }
}