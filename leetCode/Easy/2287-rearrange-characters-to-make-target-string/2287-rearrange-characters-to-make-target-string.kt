class Solution {
    fun rearrangeCharacters(s: String, target: String): Int {
        //22:12
        
        val charSet = s.groupBy { it }.mapValues { it.value.size }
        var min  = Integer.MAX_VALUE

        for (e in target.groupBy { it }.mapValues { it.value.size }) {
            if(!charSet.containsKey(e.key)) {
                min = 0
                break
            } else if(min > charSet[e.key]!!/ e.value) {
                min = charSet[e.key]!!/ e.value
            }
        }
        return min
    }
}