# Last updated: 7/9/2026, 7:42:54 AM
class Solution(object):
    def isPalindrome(self, x):
        return str(x) == str(x)[::-1]
       
        