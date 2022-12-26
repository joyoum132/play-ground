class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
       val numberOnlyLottos = lottos.filter { it != 0 }
        val zeroCnt = lottos.size - numberOnlyLottos.size

        var matched = 0

        numberOnlyLottos
            .forEach {
                lotto -> if(win_nums.contains(lotto)) matched++
            }

        fun rank(matched:Int)
        = when(matched) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
        val min = rank(matched)
        val max = rank(matched+zeroCnt)

        return intArrayOf(max, min)
    }
}