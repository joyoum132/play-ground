import kotlin.math.max

class Solution {
    fun maxProfit(prices: IntArray): Int {
        if(prices.size == 1) return 0
        var totalProfit = 0
        var rangeProfit = 0
        var s=0
        var e=1
        
        for(i in 0 until prices.size-1) {
            if(prices[i] > prices[i+1]) {
                totalProfit += rangeProfit
                rangeProfit = 0
                s = e
                e = e+1
            } else {
                rangeProfit = max(rangeProfit, prices[e]-prices[s])
                e+=1
            }
        }
        return totalProfit+rangeProfit
    }
}