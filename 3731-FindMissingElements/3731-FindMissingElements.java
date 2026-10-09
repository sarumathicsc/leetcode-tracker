// Last updated: 10/9/2026, 9:33:36 AM
import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int num : nums) {
            numSet.add(num);
            if (num < minVal) minVal = num;
            if (num > maxVal) maxVal = num;
        }
        
        List<Integer> missingElements = new ArrayList<>();
        
        for (int i = minVal + 1; i < maxVal; i++) {
            if (!numSet.contains(i)) {
                missingElements.add(i);
            }
        }
        
        return missingElements;
    }
}
