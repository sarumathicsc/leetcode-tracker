# Last updated: 7/9/2026, 7:42:56 AM
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        if len(nums1) > len(nums2):
            nums1, nums2 = nums2, nums1
        
        m, n = len(nums1), len(nums2)
        low, high = 0, m
        
        while low <= high:
            cut1 = (low + high) // 2
            cut2 = (m + n + 1) // 2 - cut1
            
            # Left and right partitions
            L1 = float('-inf') if cut1 == 0 else nums1[cut1 - 1]
            R1 = float('inf') if cut1 == m else nums1[cut1]
            
            L2 = float('-inf') if cut2 == 0 else nums2[cut2 - 1]
            R2 = float('inf') if cut2 == n else nums2[cut2]
            
            # Correct partition found
            if L1 <= R2 and L2 <= R1:
                if (m + n) % 2 == 1:
                    return float(max(L1, L2))
                else:
                    return (max(L1, L2) + min(R1, R2)) / 2.0
            
            # Move search left
            elif L1 > R2:
                high = cut1 - 1
            
            # Move search right
            else:
                low = cut1 + 1

       