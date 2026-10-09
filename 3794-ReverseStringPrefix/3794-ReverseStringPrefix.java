// Last updated: 10/9/2026, 9:33:31 AM
class Solution {
    public String reversePrefix(String s, int k) {
        if (s == null || k <= 1 || k > s.length()) {
            return s;
        }
        
        String reversedPrefix = new StringBuilder(s.substring(0, k)).reverse().toString();
        
        return reversedPrefix + s.substring(k);
    }
}
