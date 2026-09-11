class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count = 1;
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
          
          if(n == 0){
            return cur;
          }

        for(int i = 1; i<n; i++){
            
         if(nums[i-1] == nums[i]){
                count += 1;
            }
           else {
                if(count > n/3){
                    cur.add(nums[i-1]);
                } 
                   count = 1;
           }
        }
         if(count>n/3){
            cur.add(nums[n-1]);
         }
        return cur;
    }
}