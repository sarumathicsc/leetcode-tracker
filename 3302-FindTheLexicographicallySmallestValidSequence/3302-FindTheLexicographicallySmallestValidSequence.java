// Last updated: 10/9/2026, 9:34:48 AM
import java.util.*;

class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        
        int[] last = new int[m];
        Arrays.fill(last, -1);
        
        int i = n - 1, j = m - 1;
        while (i >= 0 && j >= 0) {
            if (word1.charAt(i) == word2.charAt(j)) {
                last[j] = i;
                j--;
            }
            i--;
        }
        
        List<Integer> list = new ArrayList<>();
        boolean canSkip = true;
        j = 0;
        
        for (i = 0; i < n && j < m; i++) {
            if (word1.charAt(i) == word2.charAt(j)) {
                list.add(i);
                j++;
            } else if (canSkip && (j == m - 1 || i + 1 <= last[j + 1])) {
                list.add(i);
                canSkip = false;
                j++;
            }
        }
        
        if (list.size() != m) return new int[0];
        
        int[] ans = new int[m];
        for (int k = 0; k < m; k++) ans[k] = list.get(k);
        return ans;
    }
}
