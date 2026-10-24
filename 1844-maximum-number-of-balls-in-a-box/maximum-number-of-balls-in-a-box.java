class Solution {
    public int countBalls(int lowLimit, int highLimit) {
    int[] boxes = new int[46];//range till 100000 so box no can be till 99999= 9*5
    int max = 0;
    for(int i = lowLimit; i<=highLimit;i++){
        int num = i;
        int sum = 0;

        while(num>0){
            sum = sum + num%10;
            num /=10;
        }
        boxes[sum]++;
        max = Math.max(max,boxes[sum]);
    }
    return max;
    }
}