class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf(target-nums[0] to 0)

        for(i in 1..nums.lastIndex) {
            if(map.containsKey(nums[i])) {
                return intArrayOf(map[nums[i]]!!, i)
            } else {
                map[target-nums[i]] = i
            }
        }
        return intArrayOf()
    }
}