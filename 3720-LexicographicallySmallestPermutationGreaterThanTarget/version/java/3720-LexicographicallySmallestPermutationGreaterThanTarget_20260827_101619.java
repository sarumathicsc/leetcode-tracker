// Last updated: 8/27/2026, 10:16:19 AM
1import java.util.*;
2
3class Solution {
4    public String lexGreaterPermutation(String s, String target) {
5        int n = s.length();
6        int[] totalCounts = new int[26];
7        for (char c : s.toCharArray()) {
8            totalCounts[c - 'a']++;
9        }
10
11        boolean[] prefixPossible = new boolean[n + 1];
12        prefixPossible[0] = true;
13        int[] currentCounts = totalCounts.clone();
14        
15        for (int i = 0; i < n; i++) {
16            int idx = target.charAt(i) - 'a';
17            if (currentCounts[idx] > 0) {
18                currentCounts[idx]--;
19                prefixPossible[i + 1] = true;
20            } else {
21                break;
22            }
23        }
24
25        for (int i = n - 1; i >= 0; i--) {
26            if (!prefixPossible[i]) continue;
27
28            int[] pool = totalCounts.clone();
29            for (int j = 0; j < i; j++) {
30                pool[target.charAt(j) - 'a']--;
31            }
32
33            int targetIdx = target.charAt(i) - 'a';
34            for (int c = targetIdx + 1; c < 26; c++) {
35                if (pool[c] > 0) {
36                    StringBuilder sb = new StringBuilder();
37                    sb.append(target, 0, i);
38                    sb.append((char) ('a' + c));
39                    pool[c]--;
40
41                    for (int rem = 0; rem < 26; rem++) {
42                        while (pool[rem] > 0) {
43                            sb.append((char) ('a' + rem));
44                            pool[rem]--;
45                        }
46                    }
47                    return sb.toString();
48                }
49            }
50        }
51        return "";
52    }
53}
54