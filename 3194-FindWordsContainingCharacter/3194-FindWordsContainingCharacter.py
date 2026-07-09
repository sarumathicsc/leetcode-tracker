# Last updated: 7/9/2026, 7:40:26 AM
class Solution(object):
    def findWordsContaining(self, words, x):
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        result = []
        for i, word in enumerate(words):
            if x in word:
                result.append(i)
        return result
        