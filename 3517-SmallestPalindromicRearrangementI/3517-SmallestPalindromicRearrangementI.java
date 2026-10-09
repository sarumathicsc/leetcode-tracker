// Last updated: 10/9/2026, 9:34:22 AM
class Solution {
    public String smallestPalindrome(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        
        StringBuilder leftHalf = new StringBuilder();
        String mid = "";
        
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            if (counts[i] % 2 == 1) {
                mid = String.valueOf(c);
            }
            // Append half of the frequency to the left side
            for (int j = 0; j < counts[i] / 2; j++) {
                leftHalf.append(c);
            }
        }
        
        String leftStr = leftHalf.toString();
        String rightStr = leftHalf.reverse().toString();
        
        return leftStr + mid + rightStr;
    }
}
