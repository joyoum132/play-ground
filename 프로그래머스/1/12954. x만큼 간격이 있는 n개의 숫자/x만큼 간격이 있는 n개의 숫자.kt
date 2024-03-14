class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n)
        repeat(n) {
            val l: Long = x.toLong()*it
            answer[it] = x + l
        }
        return answer
    }
}