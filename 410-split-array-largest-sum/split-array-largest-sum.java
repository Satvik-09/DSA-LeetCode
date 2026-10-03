class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
     int low = 0; int high = 0;
     for(int x : nums){
        low = Math.max(low,x); //max element
        high += x;//sum of all element
     }
  while(low<high){
    int mid = low + (high - low)/2;
    if(cansplit(nums,k,mid)){
        high = mid;
    }
    else{
        low = mid + 1;
    }
    
  }
  return low;
   }

   private boolean cansplit(int[] nums,int k,int limit){
    int count = 1; int cur = 0;
    for(int x : nums){
        if(cur + x > limit){
            count++;
            cur = x;
        }
        else{
            cur += x;
        }
    }
     return count <= k;
   }
}