// Last updated: 7/9/2026, 7:40:28 AM
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1 ; i <= n; i++){
            if(i % m != 0){
                sum1+=i;
            }
            else if(i % m == 0){
                sum2 += i;
            }
        }
        return sum1-sum2;
    }
}