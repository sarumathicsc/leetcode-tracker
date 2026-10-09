// Last updated: 10/9/2026, 9:33:19 AM
class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int x : nums1) {
            if (x % 2 != 0) {
                if (x < minOdd) {
                    minOdd = x;
                }
            } else {
                if (x < minEven) {
                    minEven = x;
                }
            }
        }
        
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }
        
        if (minEven < minOdd) {
            return false;
        }
        
        return true;
    }
}
