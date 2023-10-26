class Solution {
    fun rob(nums: IntArray): Int {
        if(nums.size == 1) return nums[0]
        val robbed = IntArray(nums.size)

        robbed[0] = nums[0]
        robbed[1] = max(nums[0], nums[1])

        for(i in 2..nums.lastIndex) {
            robbed[i] = max(robbed[i-1], robbed[i-2]+nums[i])
        }

        return robbed[nums.size-1]
    }
}