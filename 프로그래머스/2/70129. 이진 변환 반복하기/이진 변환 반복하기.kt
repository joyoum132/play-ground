class Solution {
    fun solution(s: String): IntArray {
        var v = s
        var cnt = 0
        var missed = 0
        
        while(v != "1") {
            val (match, rest) = v.toList().partition{it == '1'}
            cnt += 1
            missed += rest.size
            v = Integer.toBinaryString(match.size)
        }
        
        return intArrayOf(cnt, missed)
    }
}