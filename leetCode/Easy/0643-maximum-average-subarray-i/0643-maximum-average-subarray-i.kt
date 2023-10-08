class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var max: Int? = null
        var maxArr = IntArray(k)
        for(idx in nums.size-1 downTo 0) {
            if(idx < k-1) break

            val t = nums.sliceArray(idx-k+1..idx)
            val ts = t.sum()

            if(max == null || ts > max) {
                maxArr = t
                max = ts
            }
        }
        return maxArr.average()
    }
}