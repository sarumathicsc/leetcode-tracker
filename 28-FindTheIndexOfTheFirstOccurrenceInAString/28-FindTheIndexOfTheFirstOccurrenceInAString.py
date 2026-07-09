# Last updated: 7/9/2026, 7:42:44 AM
class Solution(object):
    def strStr(self, haystack, needle):
        if needle == "":
            return 0
        
        m, n = len(haystack), len(needle)
        
        for i in range(m - n + 1):
            if haystack[i:i+n] == needle:
                return i
        
        return -1
        