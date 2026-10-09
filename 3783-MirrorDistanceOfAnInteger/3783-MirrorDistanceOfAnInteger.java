// Last updated: 10/9/2026, 9:33:35 AM
class Solution {
    public int mirrorDistance(int n) {
        int original = n;
        int rev = 0;

        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n /10;
        }
        return Math.abs(original - rev);
    }
}