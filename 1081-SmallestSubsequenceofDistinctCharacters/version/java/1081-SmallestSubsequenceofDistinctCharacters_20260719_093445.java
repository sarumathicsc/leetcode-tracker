// Last updated: 7/19/2026, 9:34:45 AM
1import java.util.*;
2
3public class Solution {
4    public String smallestSubsequence(String s) {
5        int[] lastOcc = new int[26];
6        for (int i = 0; i < s.length(); i++) {
7            lastOcc[s.charAt(i) - 'a'] = i;
8        }
9        StringBuilder stack = new StringBuilder();
10        boolean[] seen = new boolean[26];
11        for (int i = 0; i < s.length(); i++) {
12            char curr = s.charAt(i);
13            int currIdx = curr - 'a';
14            if (seen[currIdx]) {
15                continue;
16            }
17            while (stack.length() > 0) {
18                char top = stack.charAt(stack.length() - 1);
19                int topIdx = top - 'a';
20
21                if (top > curr && lastOcc[topIdx] > i) {
22                    stack.deleteCharAt(stack.length() - 1);
23                    seen[topIdx] = false;
24                } else {
25                    break;
26                }
27            }
28            stack.append(curr);
29            seen[currIdx] = true;
30        }
31        return stack.toString();
32    }
33}
34