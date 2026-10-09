# Last updated: 10/9/2026, 9:37:38 AM
class Solution(object):
    def subsetXORSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        or_val = 0
        for num in nums:
            or_val |= num
        return or_val * (1 << (len(nums) - 1))

        