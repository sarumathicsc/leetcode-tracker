# Last updated: 7/9/2026, 7:40:45 AM
class Solution(object):
    def rearrangeArray(self, nums):
        positive = []
        negative = []
        
        for x in nums:
            if x > 0:
                positive.append(x)
            else:
                negative.append(x)

        result =[]

        for i in range(len(positive)):
            result.append(positive[i])
            result.append(negative[i])

        return result