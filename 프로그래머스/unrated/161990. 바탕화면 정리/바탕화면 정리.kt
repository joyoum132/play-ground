import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var minX = 50
        var minY = 50
        var maxX = -1
        var maxY = -1

        wallpaper.forEachIndexed { xIdx, str ->
            str.forEachIndexed { yIdx, c ->
                if(c == '#') {
                    minX = min(xIdx, minX)
                    minY = min(yIdx, minY)
                    maxX = max(xIdx, maxX)
                    maxY = max(yIdx, maxY)
                }
            }
        }

        return intArrayOf(minX, minY, maxX+1, maxY+1)
    }
}