// Last updated: 10/9/2026, 9:37:57 AM
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        
        int balls = 0;
        int operations = 0;
        for (int i = 0; i < n; i++) {
            ans[i] += operations;
            if (boxes.charAt(i) == '1') {
                balls++;
            }
            operations += balls;
        }
        
        balls = 0;
        operations = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] += operations;
            if (boxes.charAt(i) == '1') {
                balls++;
            }
            operations += balls;
        }
        
        return ans;
    }
}
