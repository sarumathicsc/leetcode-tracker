// Last updated: 7/9/2026, 7:41:57 AM
import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> jewelSet = new HashSet<>();
        
        for (int i = 0; i < jewels.length(); i++) {
            jewelSet.add(jewels.charAt(i));
        }
        
        for (int i = 0; i < stones.length(); i++) {
            if (jewelSet.contains(stones.charAt(i))) {
                count++;
            }
        }
        
        return count;
    }
}
