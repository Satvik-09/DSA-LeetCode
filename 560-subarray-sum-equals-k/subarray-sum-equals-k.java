class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int n = nums.length;
   map.put(0,1);
    int sum = 0;
    int count = 0;
    for(int i = 0; i<n;i++){
        sum += nums[i];
        int compliment = sum - k;

        if(map.containsKey(compliment)){
                 count += map.get(compliment); 
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
    } return count;
    }
}