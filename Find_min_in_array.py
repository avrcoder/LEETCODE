class Solution(object):
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        min = nums[0]
        for i in xrange(len(nums)-1):
            if nums[i+1] < nums[i]:
                min = nums[i+1]
                break
        return min
        
