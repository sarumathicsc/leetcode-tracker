// Last updated: 7/9/2026, 7:41:50 AM
class Solution {
    public int repeatedNTimes(int[] nums) {
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num; 
            }
            seen.add(num);
        }
        return -1; 
    }
}