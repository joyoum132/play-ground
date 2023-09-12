class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        if(yellow == 1) return intArrayOf(3, 3)
        val end = yellow/2
        (1..end).forEach {
            val a = yellow / it
            if(yellow % it == 0 && ((a+2)* (it+2) == brown+yellow)) {
                answer  = intArrayOf(a+2, it+2)
                return@forEach
            }
        }
        return answer.sortedArrayDescending()
    }
}