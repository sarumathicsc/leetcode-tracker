# Last updated: 7/9/2026, 7:40:55 AM
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
        