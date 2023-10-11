class Solution {
    fun closeStrings(word1: String, word2: String): Boolean {
        if(word1.length != word2.length) return false

        val map = mutableMapOf<Char, IntArray>()
        for(i in word1.indices) {
            val c1 = word1[i]
            val c2 = word2[i]
            if(map.containsKey(c1)) {
                map[c1]!![0]+=1
            } else {
                map[c1] = intArrayOf(1,0)
            }

            if(map.containsKey(c2)) {
                map[c2]!![1]+=1
            } else {
                map[c2] = intArrayOf(0,1)
            }
        }
        var a1 = intArrayOf()
        var a2 = intArrayOf()
        for(arr in map.values) {
            if(arr[0] == 0 || arr[1] == 0) return false
            a1 += arr[0]
            a2 += arr[1]
        }
        a1 = a1.sortedArray()
        a2 = a2.sortedArray()

        for(i in a1.indices) {
            if(a1[i] != a2[i]) return false
        }

        return true
    }
}