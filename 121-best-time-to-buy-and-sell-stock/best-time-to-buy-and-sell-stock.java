class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
          int mxprofit = 0;
           int minprice = Integer.MAX_VALUE;
            for(int i = 0; i<n; i++){
                if(prices[i]<minprice){
                    minprice = prices[i];
                }
                mxprofit = Math.max(prices[i]-minprice,mxprofit);
            }
        return mxprofit;
    }
}