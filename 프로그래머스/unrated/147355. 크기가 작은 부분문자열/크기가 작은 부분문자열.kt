class Solution {
    fun solution(t: String, p: String): Int {
        val range = 0..t.length-p.length

        val list: MutableList<String> = mutableListOf()
        for(i in range) {
            list.add(t.substring(i,i+p.length))
        }
        return list.count { it <= p }
    }
}