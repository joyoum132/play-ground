class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val s = Math.sqrt(yellow.toDouble()).toInt()

        fun checkIsMatrix(x: Int, y: Int): Boolean
                = (x+2)*(y+2) - (x*y) == brown

        for(i in 1..s) {
            if(yellow % i == 0 && checkIsMatrix(i, yellow / i)) {
                return intArrayOf(
                    Math.max(i, yellow/i)+2,
                    Math.min(i, yellow/i)+2
                )
            }
        }
        return intArrayOf(0,0)
    }
}