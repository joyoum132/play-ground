import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxW = 0
        var maxH = 0
        
        for(size in sizes) {
            maxW = max(maxW, min(size[0], size[1]))
            maxH = max(maxH, max(size[0], size[1]))
        } 
        
        return maxW*maxH
    }
}