class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int product1 = nums[0];
        int product2 = nums[0];
        int mxproduct = nums[0];

        for(int i = 1; i<n; i++){
            int cur = nums[i];
            int p1max = product1 * cur;
            int p2min = product2 * cur;

            int newmx = Math.max(cur,Math.max(p1max,p2min));
            int newmn = Math.min(cur,Math.min(p1max,p2min));

            product1 = newmx;
            product2 = newmn;
            mxproduct = Math.max(mxproduct,product1);
        }
               return mxproduct;
    }
}