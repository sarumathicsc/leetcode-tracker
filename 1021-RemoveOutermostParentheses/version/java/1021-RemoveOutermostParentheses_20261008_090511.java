// Last updated: 10/8/2026, 9:05:11 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder result = new StringBuilder();
4        int opened = 0;
5        
6        for (char c : s.toCharArray()) {
7            if (c == '(') {
8                if (opened > 0) {
9                    result.append(c);
10                }
11                opened++;
12            } else {
13                opened--;
14                if (opened > 0) {
15                    result.append(c);
16                }
17            }
18        }
19        return result.toString();
20    }
21}
22