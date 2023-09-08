class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var mw = 0
        var mh = 0
        
        sizes.forEach {
            if(it[0] > it[1]) {
                val temp = it[0]
                it[0] = it[1]
                it[1] = temp
            }
            
            if(it[0] > mw) mw = it[0]
            if(it[1] > mh) mh = it[1]
        }
        return mw * mh
    }
}