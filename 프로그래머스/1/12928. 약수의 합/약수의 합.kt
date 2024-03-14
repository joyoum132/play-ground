class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        val s = Math.sqrt(n.toDouble()).toInt()
        for(i in 1..s) {
            if(n%i==0) {
                answer += i
                answer += n/i
            }
        }
        
        if(s*s == n) {
            answer-=s
        }
        return answer
    }
}