class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var max = 0
        var points = IntArray(gain.size+1){0}
        
        for(i in gain.indices) {
            val v = points[i]+gain[i]
            points[i+1] = v
            
            max = max(max, v)
        }
        return max
    }
}