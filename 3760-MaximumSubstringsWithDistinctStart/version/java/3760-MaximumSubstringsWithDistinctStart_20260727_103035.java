// Last updated: 7/27/2026, 10:30:35 AM
1class Solution {
2    public int maxDistinct(String s) {
3        int distinctcount = 0;
4        boolean[] seen = new boolean[26];
5
6        for(int i = 0; i < s.length(); i++){
7            int index = s.charAt(i) - 'a';
8            if(!seen[index]){
9                seen[index] = true;
10                distinctcount++;
11            }
12        }
13        return distinctcount;
14    }
15}