class Solution {
    fun rob(nums: IntArray): Int {
        if(nums.size == 1) return nums[0]
        var last = 0
        val robbed = IntArray(nums.size)

        robbed[0] = nums[0]
        if(nums[0] < nums[1]) {
            last = 1
            robbed[1] = nums[1]
        } else {
            robbed[1] = nums[0]
        }

        for(i in 2..nums.lastIndex) {
            if(nums[i] == 0) {
                robbed[i] = robbed[i-1]
                continue
            }

            if(last == i-1) {
                if(robbed[i-1] > robbed[i-2]+nums[i]) {
                    robbed[i] = robbed[i-1]
                } else {
                    robbed[i] = robbed[i-2]+nums[i]
                    last = i
                }
            } else {
                robbed[i] = robbed[i-2] + nums[i]
                last = i
            }
        }

        return robbed[nums.size-1]
    }
}