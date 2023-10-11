class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        val a1 = mutableSetOf<IntArray>()
        val a2 = mutableSetOf<IntArray>()
        for(i in 0 until grid.size) {
            var aa1 = IntArray(grid.size)
            var aa2 = IntArray(grid.size)
            for(j in 0 until grid.size) {
                aa1 += grid[i][j]
                aa2 += grid[j][i]
            }
            a1 += aa1
            a2 += aa2
        }

        return a1.sumOf { it ->
            a2.count { i -> i.contentEquals(it) }
        }
    }
}