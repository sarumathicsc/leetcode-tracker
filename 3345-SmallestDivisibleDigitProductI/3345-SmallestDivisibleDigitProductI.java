// Last updated: 10/9/2026, 9:34:39 AM
class Solution {
    public int smallestNumber(int n, int t) {
        int x = n;
        while (true) {
            int product = 1;
            int temp = x;
            
            while (temp > 0) {
                product *= (temp % 10);
                temp /= 10;
            }
            
            if (product % t == 0) {
                return x;
            }
            
            x++;
        }
    }
}
