You can find the question here:

https://leetcode.com/problems/find-the-duplicate-number/

The solution in O(n) and O(1) is:

class Solution(object):
def findDuplicate(self, nums):
"""
:type nums: List[int]
:rtype: int
"""
for i in xrange(len(nums)):
if nums[abs(nums[i])] > 0:
nums[abs(nums[i])] = -nums[abs(nums[i])]
else:
return abs(nums[i])
