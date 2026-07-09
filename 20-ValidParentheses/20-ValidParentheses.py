# Last updated: 7/9/2026, 7:42:48 AM
class Solution(object):
    def isValid(self, s):
        stack = []
        # map closing -> opening
        pairs = {')': '(', '}': '{', ']': '['}
        
        for ch in s:
            if ch in pairs:               
                if not stack or stack[-1] != pairs[ch]:
                    return False
                stack.pop()
            else:                         
                stack.append(ch)
        return not stack

        