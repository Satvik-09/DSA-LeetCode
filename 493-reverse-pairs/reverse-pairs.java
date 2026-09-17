class Solution {
        private long mergesort(int[] nums, int start, int end){
            long count = 0;
            if(start>=end) return count;
            int mid =  start + (end - start)/2;
           count += mergesort(nums,start,mid);
           count += mergesort(nums,mid+1,end);
           count += countpairs(nums,start,mid,end);
           merge(nums,start,mid,end);
           return count;
        }
           private long countpairs(int[] nums, int low, int mid, int high){
           int j = mid+1; long count = 0;
            for(int i = low; i<mid+1;i++){
            while(j <= high && nums[i] > 2L*nums[j]){
                   j++; }
                    count += (j-(mid+1));
            }
            return count;
           }

           private void merge(int[] nums, int low, int mid, int high){
            List<Integer> temp = new ArrayList<>();
            int i = low; int j = mid + 1;
            while(i<=mid && j<=high){
                if(nums[i] < nums[j]){
                    temp.add(nums[i++]);
                }
                else{
                    temp.add(nums[j++]);
                }
            }
            while(i<=mid){ temp.add(nums[i++]);}
            while(j<=high){ temp.add(nums[j++]);}

            for(int k = low; k<=high; k++){
                nums[k] = temp.get(k-low);
            }
           }

    public int reversePairs(int[] nums) {
        return (int) mergesort(nums,0,nums.length-1);
    }
}