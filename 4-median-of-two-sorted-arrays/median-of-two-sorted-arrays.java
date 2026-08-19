class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int m = nums2.length;
    int m1; int m2;
    int[] res  = new int[n+m];
        System.arraycopy(nums1,0,res,0,n);
        System.arraycopy(nums2,0,res,n,m);
        Arrays.sort(res);
        int x = res.length;
        int  y =0;
        if(x%2 == 1){
         y = x/2;
         return res[y];
        }
        else if(x%2 == 0){
            m1 = x/2;
            m2 = x/2-1;
         float a = (float)(res[m1]+res[m2])/2;
         return a;
        }
        else {
            return 0;
        }
    }
}