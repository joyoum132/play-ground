class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var longest = intArrayOf()
        var len = 0
        var idx = -1

        for(i in nums.indices) {
            if(nums[i] == 0) {
                longest += if(idx == -1) i else (i-idx-1)
                idx = i
                len = 0
            } else {
                len+=1
                if(i == nums.size-1) {
                    longest += len
                }
            }
        }
        if(idx == -1) return nums.size-1
        
        var max = 0
        for(i in 0 until longest.size-1) {
            val t = longest[i]+longest[i+1]
            if(t > max) max = t
        }
        return max
    }
}