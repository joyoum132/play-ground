class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map {
            val start = it[0]
            val end = it[1]
            val find = it[2]
            array.slice(start-1..end-1)
                .sorted()[find-1]
        }.toIntArray()
    }
}