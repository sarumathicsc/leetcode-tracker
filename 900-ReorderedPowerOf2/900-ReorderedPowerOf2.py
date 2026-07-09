# Last updated: 7/9/2026, 7:41:55 AM
class Solution(object):
    def reorderedPowerOf2(self, n):
        """
        :type n: int
        :rtype: bool
        """
        def count_digits(x):
            return sorted(str(x))
        
        target = count_digits(n)
        
        for i in range(31):  # 2^0 to 2^30 covers up to 10^9
            if count_digits(1 << i) == target:
                return True
        return False


        