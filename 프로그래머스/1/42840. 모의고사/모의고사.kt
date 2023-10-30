import kotlin.math.max

class Solution {
    fun solution(answers: IntArray): IntArray {
        val one = intArrayOf(1,2,3,4,5)
        val two = intArrayOf(2,1,2,3,2,4,2,5)
        val thr = intArrayOf(3,3,1,1,2,2,4,4,5,5)

        val res : MutableMap<Int, Int> = mutableMapOf(1 to 0, 2 to 0, 3 to 0)

        var i = 0
        for(answer in answers) {
            res[1] = res[1]!! + if(answer == one[i%5]) 1 else 0
            res[2] = res[2]!! + if(answer == two[i%8]) 1 else 0
            res[3] = res[3]!! + if(answer == thr[i%10]) 1 else 0
            i+=1
        }

        val max = max(max(res[1]!!, res[2]!!), res[3]!!)
        return res.filter { it.value >= max }.map { it.key }.toIntArray()
    }
}