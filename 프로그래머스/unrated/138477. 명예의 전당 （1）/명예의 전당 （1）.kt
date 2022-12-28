class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        return (1..score.size)
            .map {
                score
                    .sliceArray(0 until it)
                    .sortedArray()[if(it > k) it- k else 0]
            }.toIntArray()
    }
}