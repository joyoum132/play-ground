class Solution {
    fun rob(nums: IntArray): Int {
        if(nums.size == 1) return nums[0]
        if(nums.size == 2) return max(nums[0], nums[1])
        var before = max(nums[0], nums[1])
        var bBefore = nums[0]
        var current = 0

        for(i in 2..nums.lastIndex) {
            current = max(before, bBefore + nums[i])
            bBefore = before
            before = current
        }

        return current
    }
}