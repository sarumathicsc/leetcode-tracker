# Last updated: 10/9/2026, 9:37:25 AM
class Solution(object):
    def buildArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ans = [0]*len(nums)
        for i in range (len(nums)):
            ans[i] = nums[nums[i]]
        return ans
        