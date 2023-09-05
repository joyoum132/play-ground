class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val w = park.size-1
        val h = park[0].length-1
        var x = 0
        var y = 0
        val map = Array(park.size) { Array(park[0].length) { "" } }

        park.forEachIndexed { xIdx, s ->
            s.forEachIndexed { yIdx, word ->
                map[xIdx][yIdx] = word.toString()
                if(word == 'S') {
                    y = xIdx
                    x = yIdx
                }
            }
        }

        routes.forEach {
            val d = it.split(" ")[0]
            val m = it.split(" ")[1].toInt()
            val localX = x
            val localY = y

            for(i in 1 .. m) {
                when(d) {
                    "E" -> x += 1
                    "W" -> x -= 1
                    "S" -> y += 1
                    "N" -> y -= 1
                }

                if(y !in 0..w || x !in 0..h || (map[y][x] == "X")) {
                    x = localX
                    y = localY
                    break
                }
            }
        }
        return intArrayOf(y, x)
    }
}