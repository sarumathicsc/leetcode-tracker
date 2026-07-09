# Last updated: 7/9/2026, 7:42:13 AM
class Solution(object):
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        return n>0 and (n&(n-1)) == 0
        