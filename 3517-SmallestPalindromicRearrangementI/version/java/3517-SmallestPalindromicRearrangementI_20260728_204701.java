// Last updated: 7/28/2026, 8:47:01 PM
1class Solution {
2    public String smallestPalindrome(String s) {
3        int[] counts = new int[26];
4        for (char c : s.toCharArray()) {
5            counts[c - 'a']++;
6        }
7        
8        StringBuilder leftHalf = new StringBuilder();
9        String mid = "";
10        
11        for (int i = 0; i < 26; i++) {
12            char c = (char) ('a' + i);
13            if (counts[i] % 2 == 1) {
14                mid = String.valueOf(c);
15            }
16            // Append half of the frequency to the left side
17            for (int j = 0; j < counts[i] / 2; j++) {
18                leftHalf.append(c);
19            }
20        }
21        
22        String leftStr = leftHalf.toString();
23        String rightStr = leftHalf.reverse().toString();
24        
25        return leftStr + mid + rightStr;
26    }
27}
28