class Solution {
    data class Album(val idx: Int, val play: Int)

    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        var res = intArrayOf()
        val m = mutableMapOf<String, Array<Album>>()

        for(i in genres.indices) {
            if(m.containsKey(genres[i])) {
                m[genres[i]] = m[genres[i]]!! + Album(i, plays[i])
            } else {
                m[genres[i]] = arrayOf(Album(i, plays[i]))
            }
        }

        m.keys
            .sortedByDescending { m[it]!!.sumOf { i -> i.play } }
            .forEach {
                var entry: Array<Album> = m[it]!!
                if(entry.size == 1) res+= entry[0].idx
                else {
                    val temp = entry.sortedByDescending { i -> i.play }
                    res += temp[0].idx
                    res += temp[1].idx
                }
            }

        return res
    }
}