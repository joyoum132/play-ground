class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var isZero = 0
        var isMatched = 0
        lottos.forEach {
            if(it==0) isZero++
            else if(win_nums.contains(it)) isMatched++
        }
        //최고 순위, 최저 순위
        return intArrayOf(orders(isMatched+isZero), orders(isMatched))
    }
    
    fun orders(cnt: Int) :Int =
    when(cnt) {
        6 -> 1
        5 -> 2
        4 -> 3
        3 -> 4
        2 -> 5
        else -> 6
    }
}