class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {

        class RatePerStage(val stage: Int, val rate: Double)


        return (1 .. N)
            .map { n ->

                val users = stages.filterNot { it < n }
                if(users.isEmpty()) RatePerStage(n, 0.0)
                else RatePerStage(n,users.count { it == n }.toDouble() / users.count { it >= n }.toDouble())

            }.sortedWith(
                compareByDescending(RatePerStage::rate)
                    .thenComparing(RatePerStage::stage)
            ).map {
                it.stage 
            }.toIntArray()
    }
}