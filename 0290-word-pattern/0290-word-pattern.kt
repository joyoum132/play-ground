class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val map = mutableMapOf<String, String>()
        val pArr = pattern.toCharArray()
        val sArr = s.split(" ")
        if(pArr.size != sArr.size) return false
        var idx = 0
        for(c in pArr) {
            val key = c.toString()
            val value = sArr[idx]
            idx += 1
            if(map.containsKey(key)) {
                if(map[key] != value) return false

            } else {
                map[key] = value
            }
        }
        if(map.map { it.value }.distinct().count() != map.size) return false
        return true
    }
}