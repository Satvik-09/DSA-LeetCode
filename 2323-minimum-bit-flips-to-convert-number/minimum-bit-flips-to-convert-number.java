class Solution {
    public int minBitFlips(int start, int goal) {
         int count = 0;
        int ans = start ^ goal;
        return Integer.bitCount(ans);
    }
}