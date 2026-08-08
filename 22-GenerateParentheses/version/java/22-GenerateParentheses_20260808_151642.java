// Last updated: 8/8/2026, 3:16:42 PM
1import java.util.*;
2
3class Solution {
4    public List<String> generateParenthesis(int n) {
5        List<String> result = new ArrayList<>();
6        backtrack(result, new StringBuilder(), 0, 0, n);
7        return result;
8    }
9    
10    private void backtrack(List<String> result, StringBuilder current, int open, int close, int max) {
11        if (current.length() == max * 2) {
12            result.add(current.toString());
13            return;
14        }
15        
16        if (open < max) {
17            current.append("(");
18            backtrack(result, current, open + 1, close, max);
19            current.deleteCharAt(current.length() - 1); // backtrack step
20        }
21        
22        if (close < open) {
23            current.append(")");
24            backtrack(result, current, open, close + 1, max);
25            current.deleteCharAt(current.length() - 1); // backtrack step
26        }
27    }
28}
29