class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var m = 0
        for(i in candies) {
            if(i > m) m = i
        }
        return candies.map { it+extraCandies >= m }
    }
}