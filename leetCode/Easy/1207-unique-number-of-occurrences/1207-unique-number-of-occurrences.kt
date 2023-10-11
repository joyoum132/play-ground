class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()
        var ra = intArrayOf()

        for(i in arr) {
            map[i] = (map[i]?:0) + 1
        }

        for(m in map) {
            ra += m.value
        }

        return map.size == ra.distinct().size
    }
}