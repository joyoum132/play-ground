class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val map = HashMap<Int, Int>()

        for(t in tangerine) {
            map.compute(t) {_,v -> (v?:0)+1}
        }
        var curT = 0
        var t = 0
        for(cnt in map.values.sortedDescending()) {
            curT += cnt
            t+=1
            if(curT >= k) {
                return t
            }
        }
        return t
    }
}