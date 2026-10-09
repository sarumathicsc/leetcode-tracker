// Last updated: 10/9/2026, 9:35:16 AM
class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }
        
        Arrays.sort(count);
        
        int totalPushes = 0;
        int distinctCount = 0;
        
        for (int i = 25; i >= 0; i--) {
            if (count[i] == 0) break;
            
            int pushesPerLetter = (distinctCount / 8) + 1;
            totalPushes += count[i] * pushesPerLetter;
            distinctCount++;
        }
        
        return totalPushes;
    }
}
