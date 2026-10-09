// Last updated: 10/9/2026, 9:34:04 AM
class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0;
        int digitProduct = 1;
        int x = n;
        
        while (x > 0) {
            int digit = x % 10;
            digitSum += digit;
            digitProduct *= digit;
            x /= 10;
        }
        
        return n % (digitSum + digitProduct) == 0;
    }
}
