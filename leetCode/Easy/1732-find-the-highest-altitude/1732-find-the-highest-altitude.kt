class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var max = 0
        var point = 0
        
        for(i in gain.indices) {
            point += gain[i]
            max = max(max, point)
        }
        return max
    }
}