# Last updated: 7/9/2026, 7:42:43 AM
class Solution(object):
    def lengthOfLastWord(self, s):
        return len(s.strip().split()[-1])
        