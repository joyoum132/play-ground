class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var res = 1
        val map = HashMap<String, Int>()
        for(c in clothes) {
            map.compute(c[1]) { _,value -> (value?:0)+1}
        }

        for(m in map) {
            res *= (m.value+1)
        }
        return res-1
    }
}