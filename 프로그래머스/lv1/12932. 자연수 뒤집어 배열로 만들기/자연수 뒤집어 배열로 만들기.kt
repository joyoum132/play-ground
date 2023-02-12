class Solution {
    fun solution(n: Long): IntArray {
        return n.toString()
            .toCharArray()
            .reversed()
            .map { it.digitToInt() }
            .toIntArray()
    }
}