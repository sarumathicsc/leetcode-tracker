// Last updated: 7/9/2026, 7:42:09 AM
class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        String v = "aeiouAEIOU";
        int i = 0, j = c.length - 1;
        while (i < j) {
            while (i < j && v.indexOf(c[i]) < 0) i++;
            while (i < j && v.indexOf(c[j]) < 0) j--;
            char temp = c[i]; c[i++] = c[j]; c[j--] = temp;
        }
        return new String(c);

    }
}