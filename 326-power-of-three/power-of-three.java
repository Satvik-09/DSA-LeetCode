class Solution {
    public boolean isPowerOfThree(int n) {
        return sqr(n,0);
    }
    private boolean sqr(int n,int x){
        double ans = Math.pow(3,x);
        if(n == ans && x < n) {return true;}
        else if(n > ans){
           return sqr(n,x+1);
        }
        
       return false;
    }
}