import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer = 0
        fun getPower(p: Int) : Int = if(p > limit) power else p

        (1..number).forEach { n ->
            if(n == 1) {
                answer += getPower(n)
                return@forEach
            } else {
                val sqrt = sqrt(n.toDouble()).toInt()
                var cnt = 0
                (1..sqrt).forEach { s ->
                    if(n%s == 0) {
                        cnt += 2
                    }

                }
                val p = if(sqrt*sqrt == n) cnt-1 else cnt
                answer += getPower(p)
            }
        }
        return answer
    }
}