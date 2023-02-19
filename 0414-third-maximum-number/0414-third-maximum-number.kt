class Solution {
    fun thirdMax(nums: IntArray): Int {
        val numSet = nums.toSet().sortedDescending()
        return if(numSet.size>2) numSet[2] else numSet[0]
    }
}