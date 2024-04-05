class Solution {
    fun rob(nums: IntArray): Int {
        if(nums.size == 1) return nums[0]
    
        val r = IntArray(nums.size){0}
        r[0] = nums[0]
        r[1] = Math.max(nums[0], nums[1])
        
        for(i in 2..nums.lastIndex) {
            r[i] = Math.max(r[i-2]+nums[i], r[i-1])
        }
        
        return r[nums.lastIndex]
    }
}