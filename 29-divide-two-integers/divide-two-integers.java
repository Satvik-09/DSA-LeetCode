class Solution {
    public int divide(int dividend, int divisor) {
       
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

          
          long a = Math.abs((long) dividend);
          long b = Math.abs((long) divisor);

          boolean negative = (dividend < 0) ^ (divisor < 0);
          long quotient = 0;
          while(a >= b){
             long temp = b;
             long count = 1;

             while(a >= (temp<<1)){
                temp <<= 1;
                count <<=1;
             }
             a -= temp;
             quotient += count;
          }
          return negative ? (int) -quotient : (int) quotient;
    }
}