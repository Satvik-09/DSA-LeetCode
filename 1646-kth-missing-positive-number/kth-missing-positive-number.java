class Solution {
    public int findKthPositive(int[] arr, int k) {
          int num = 1;
          int missingcount = 0;
          int i = 0;
        while(missingcount < k){
            if(i<arr.length && arr[i] == num){
                i++;
            }
            else{
                missingcount++;
                if(missingcount == k) return num;
            }
            num++;
        }
      return -1;
    }
}