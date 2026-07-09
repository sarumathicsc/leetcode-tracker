# Last updated: 7/9/2026, 7:42:59 AM
class Solution(object):
    def twoSum(self, nums, target):
        lookup = {}
        for i,num in enumerate(nums):
            rem = target - num
            if rem in lookup:
                return [lookup[rem],i]
            lookup[num] = i

        