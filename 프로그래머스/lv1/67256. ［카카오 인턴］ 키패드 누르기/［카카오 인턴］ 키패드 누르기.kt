import kotlin.math.abs

class Solution {
    fun getCoord(n: Int) : Pair<Int, Int> {
        return mapOf(
            1 to Pair(0,0), 2 to Pair(0,1), 3 to Pair(0,2),
            4 to Pair(1,0), 5 to Pair(1,1), 6 to Pair(1,2),
            7 to Pair(2,0), 8 to Pair(2,1), 9 to Pair(2,2),
            10 to Pair(3,0), 11 to Pair(3,1), 12 to Pair(3,2),
        )[n]!!
    }
    
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        var left = 10
        var right = 12
        val h = if(hand == "left") "L" else "R"

        fun getNear(n: Int) : String {
            val ld = abs(getCoord(left).first-getCoord(n).first) + abs(getCoord(left).second-getCoord(n).second)
            val rd = abs(getCoord(right).first-getCoord(n).first) + abs(getCoord(right).second-getCoord(n).second)

            return if(rd == ld) h
                else if(ld < rd) "L"
                else "R"
        }

        numbers.forEach {
            val i = if(it == 0) 11 else it
            val pos = when(i) {
                1, 4, 7 -> "L"
                3, 6, 9 -> "R"
                else -> getNear(i)
            }
            answer+=pos
            if(pos == "L") left = i else right=i
        }

        return answer
    }
}