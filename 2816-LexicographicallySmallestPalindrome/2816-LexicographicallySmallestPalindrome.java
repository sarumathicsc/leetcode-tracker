// Last updated: 7/9/2026, 7:40:33 AM
class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            if (chars[left] != chars[right]) {
                char minChar = (char) Math.min(chars[left], chars[right]);
                chars[left] = minChar;
                chars[right] = minChar;
            }
            left++;
            right--;
        }
        return new String(chars);
    }
}