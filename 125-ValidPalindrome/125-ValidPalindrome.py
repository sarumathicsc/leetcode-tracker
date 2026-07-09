# Last updated: 7/9/2026, 7:42:31 AM
class Solution(object):
    def isPalindrome(self, s):
        filtered_s = ''.join(c for c in s if c.isalnum()).lower()
        return filtered_s == filtered_s[::-1]
