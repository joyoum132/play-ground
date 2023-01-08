class Solution {
    fun solution(arr: IntArray): IntArray {
        return if(arr.size > 1) {
            val min = arr.minOf { it }
            arr.filter { it != min }.toIntArray()
        } else {
            intArrayOf(-1)
        }
    }
}