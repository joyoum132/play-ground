class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        if(cost.size < 2) return cost.size
        val stairs = IntArray(cost.size)
        stairs[0] = cost[0]
        stairs[1] = cost[1]
        
        for(i in 2 until cost.size) {
            stairs[i] = Math.min(stairs[i-1], stairs[i-2]) + cost[i]
        }
        
        return Math.min(stairs[cost.size-1], stairs[cost.size-2])
    }
}