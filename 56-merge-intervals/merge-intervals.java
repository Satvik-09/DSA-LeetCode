class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals,(a,b) -> a[0]- b[0]);
        res.add(intervals[0]);// adds the 0 interval
        for(int i = 1; i<n; i++){
            int[] last = res.get(res.size()-1);

            if(last[1] >= intervals[i][0]){
                last[1] = Math.max(last[1],intervals[i][1]);
            }
            else{
                res.add(intervals[i]);
            }
        }  return res.toArray(new int[res.size()-1][]);
    }
}