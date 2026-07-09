// Last updated: 7/9/2026, 7:41:58 AM
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastIndices = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndices[s.charAt(i) - 'a'] = i;
        }
        
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int boundary = 0;
        
        for (int i = 0; i < s.length(); i++) {
            boundary = Math.max(boundary, lastIndices[s.charAt(i) - 'a']);
            
            if (i == boundary) {
                result.add(i - start + 1);
                start = i + 1;
            }
        }
        
        return result;
    }
}
