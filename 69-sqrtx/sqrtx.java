class Solution {
    public int mySqrt(int x) {
        int left = 1; int right = x/2;
       int ans = 0;
        if(x<2) return x;
        while(left<=right){
            
            int mid = left + (right - left)/2;
             long cur = (long)mid*mid;
            if(cur == x) return mid;
            if(cur<x){
                 ans = mid;
                 left = mid + 1; }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }
}