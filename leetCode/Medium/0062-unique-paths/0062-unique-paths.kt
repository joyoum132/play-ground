class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        
        val up = Array(m) { IntArray(n) {0} }
        up[0][0] = 1
        
        for(row in 0 until m) {
            for(col in 0 until n) {
                if(row == 0 && col == 0) continue
                
                val left = if(col-1 < 0) 0 else up[row][col-1]
                val top = if(row-1 < 0) 0 else up[row-1][col]
                up[row][col] = left+top
            }
        }
        
        return up[m-1][n-1]
    }
}