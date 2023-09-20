class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var t = k
        val map = tangerine.groupBy { it }.mapValues { it.value.size }
        for( i in map.values.sortedDescending()) {
            t -= i
            answer += 1
            if(t <= 0) {
                break
            }
        }
        return answer
    }
}