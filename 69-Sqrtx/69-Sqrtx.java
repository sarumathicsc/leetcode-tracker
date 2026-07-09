// Last updated: 7/9/2026, 7:42:40 AM
class Solution {
    public int mySqrt(int x) {
        int ans = 0;

        for(long i = 0; i*i <= x;i++){
            ans = (int) i;
        }
        return ans;
    }
}