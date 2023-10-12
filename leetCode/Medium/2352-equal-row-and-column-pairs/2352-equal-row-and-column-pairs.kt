class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        val a1 = arrayListOf<String>()
        val a2 = arrayListOf<String>()
        
        for(i in 0 until grid.size) {
            var s1 = StringBuilder()
            var s2 = StringBuilder()
            for(j in 0 until grid.size) {
                s1.append(grid[i][j]).append(" ")
                s2.append(grid[j][i]).append(" ")
            }
            a1 += s1.toString()
            a2 += s2.toString()
        }

        return a1.sumOf { a2.count { i-> i == it} }
    }
}