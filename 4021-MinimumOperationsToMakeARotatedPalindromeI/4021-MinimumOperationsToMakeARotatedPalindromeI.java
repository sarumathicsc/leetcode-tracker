// Last updated: 10/9/2026, 9:32:33 AM
class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int ans = Integer.MAX_VALUE;

        for(int r = 0; r < n; r++){
            int operations = r;
            for(int i = 0; i < n/2; i++){
                char a = s.charAt((i+r)%n);
                char b = s.charAt((n-1-i+r)%n);

                int diff = Math.abs(a-b);

                operations += Math.min(diff, 26-diff);
            }
            ans = Math.min(ans, operations);
        }
        return ans;
    }
}