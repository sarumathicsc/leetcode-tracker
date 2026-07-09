// Last updated: 7/9/2026, 7:41:11 AM
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        
        for (int i = 0; i < l.length; i++) {
            result.add(check(nums, l[i], r[i]));
        }
        
        return result;
    }
    
    private boolean check(int[] nums, int start, int end) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        
        for (int i = start; i <= end; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            set.add(nums[i]);
        }
        
        int len = end - start + 1;
        
        if (min == max) {
            return true; 
        }
        
        if ((max - min) % (len - 1) != 0) {
            return false;
        }
        
        int diff = (max - min) / (len - 1);
        
        int current = min;
        for (int i = 0; i < len; i++) {
            if (!set.contains(current)) {
                return false;
            }
            current += diff;
        }
        
        return true;
    }
}