class Solution {
    static final long MOD = 1_000_000_007L;
    private long power(long base, long exp){
        long res = 1;
        base %= MOD;
        while(exp > 0){
            if((exp & 1) == 1){
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;

        }
        return res;
    }


    public int countGoodNumbers(long n) {
         long evenindex = (n + 1)/2;
         long oddindex =  ( n / 2);
         return (int) ((power(5,evenindex) * power(4,oddindex)) % MOD); 
    }
}