// Last updated: 7/30/2026, 6:35:22 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int n = word.length();
4        
5        if (n <= 8) return n;
6        if (n <= 16) return 8 + (n - 8) * 2;
7        if (n <= 24) return 8 + 16 + (n - 16) * 3;
8        
9        return 8 + 16 + 24 + (n - 24) * 4;
10    }
11}