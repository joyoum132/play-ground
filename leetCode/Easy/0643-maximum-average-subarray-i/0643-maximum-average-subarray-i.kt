class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = 0
        var avg : Double? = null

        for (i in nums.indices) {
            sum += nums[i]
            if(i >= k-1) {
                val a: Double = sum.toDouble() / k
                if(avg == null || avg < a ) {
                    avg = a
                }
                sum -= nums[i-k+1]
            }
        }
        return avg!!
    }
}