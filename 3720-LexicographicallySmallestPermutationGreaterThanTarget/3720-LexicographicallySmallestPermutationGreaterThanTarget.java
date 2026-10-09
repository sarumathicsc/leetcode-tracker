// Last updated: 10/9/2026, 9:33:56 AM
import java.util.*;

class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] totalCounts = new int[26];
        for (char c : s.toCharArray()) {
            totalCounts[c - 'a']++;
        }

        boolean[] prefixPossible = new boolean[n + 1];
        prefixPossible[0] = true;
        int[] currentCounts = totalCounts.clone();
        
        for (int i = 0; i < n; i++) {
            int idx = target.charAt(i) - 'a';
            if (currentCounts[idx] > 0) {
                currentCounts[idx]--;
                prefixPossible[i + 1] = true;
            } else {
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (!prefixPossible[i]) continue;

            int[] pool = totalCounts.clone();
            for (int j = 0; j < i; j++) {
                pool[target.charAt(j) - 'a']--;
            }

            int targetIdx = target.charAt(i) - 'a';
            for (int c = targetIdx + 1; c < 26; c++) {
                if (pool[c] > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(target, 0, i);
                    sb.append((char) ('a' + c));
                    pool[c]--;

                    for (int rem = 0; rem < 26; rem++) {
                        while (pool[rem] > 0) {
                            sb.append((char) ('a' + rem));
                            pool[rem]--;
                        }
                    }
                    return sb.toString();
                }
            }
        }
        return "";
    }
}
