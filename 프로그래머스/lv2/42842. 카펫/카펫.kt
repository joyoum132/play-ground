class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        if(yellow == 1) return intArrayOf(3, 3)
        for(i in 1..yellow/2) {
            val a = yellow / i
            if(yellow % i == 0 && ((a+2)* (i+2) == brown+yellow)) {
                answer = intArrayOf(a+2, i+2)
                break
            }
        }
        return answer
    }
}