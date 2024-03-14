class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val tValues: List<Int> = tangerine
        .groupBy { it }
        .map { it.value.size }
        .sortedDescending()

        var packedTangerine = 0
        for (i in tValues.indices) {
            packedTangerine+= tValues[i]
            if(packedTangerine >= k) return i+1

        }
        return 0
    }
}