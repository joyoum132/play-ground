import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int {
        val sq = sqrt(n.toDouble()).toInt()
        var res = intArrayOf()
        for(i in 1 .. sq) {
            if(n % i == 0) res += i
        }

        for(i in 0 until res.size) {
            res += n/res[i]
        }

        return res.distinct().sum()
    }
}