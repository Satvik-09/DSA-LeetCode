class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int posidx = 0; int negidx = 1;
        int[] res = new int[n];
            for(int i =0; i<n; i++){
                if(nums[i]>0){
                 res[posidx] = nums[i];
                 posidx +=2;
                }
                else{
                    res[negidx] = nums[i];
                    negidx+=2;
                }
            }
        return res;
    }
}