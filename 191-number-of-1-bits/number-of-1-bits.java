class Solution {
    public int hammingWeight(int n) {
        int count = 0; int digit = 0;
        while(n != 0){
            digit = n % 2;
            n /= 2;
            if(digit == 1){
                count++;
            }

        }
        return count;
    }
}