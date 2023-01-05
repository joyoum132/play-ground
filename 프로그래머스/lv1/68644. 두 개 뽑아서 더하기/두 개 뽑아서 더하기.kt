class Solution {
    fun solution(numbers: IntArray): IntArray {
        return (0 until numbers.lastIndex)
            .map {idx ->
                numbers
                    .sliceArray(idx+1..numbers.lastIndex)
                    .map { numbers[idx] +it }
            }.flatten()
            .distinct()
            .sorted()
            .toIntArray()
    }
}