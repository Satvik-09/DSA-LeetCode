class Solution {
    int count = 0;
    private void mergesort(int[] nums,int low,int high){
        if(low>=high) return;
        int mid = (high + low)/2;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        cntpairs(nums,low,mid,high);
        merge(nums,low,mid,high);
    }

    private void merge(int[] nums, int low, int mid, int high){
       List<Integer> temp = new ArrayList<>();
        int left = low; int right = mid+1;
        while(left<=mid && right <= high){
            if(nums[left] < nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else {
                temp.add(nums[right]);
                right++;
            }
        }
        //first half 0 to mid
       while(left<=mid) temp.add(nums[left++]);
       // adding remaining half which are remained
       while(right<=high) temp.add(nums[right++]);
         //adding all from 0 to high
        for(int i = low; i<=high; i++){
            nums[i] = temp.get(i-low);
        }
    }
      private void cntpairs(int[] nums, int low, int mid, int high){
        int right = mid+1; 
         for(int left = low; left<mid+1; left++){
            while(right<=high && nums[left] > 2L*nums[right]){
                right++;
            }
            count += (right - (mid+1));
         }
      }

    public int reversePairs(int[] nums) {
        int n = nums.length;
        count = 0;
        mergesort(nums,0,n-1);
        return count;
    }
}