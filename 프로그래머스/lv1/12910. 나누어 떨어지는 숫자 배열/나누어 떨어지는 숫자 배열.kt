class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val result = arr.filter { it%divisor == 0 }
    
        return if(result.isNotEmpty()) result.sorted().toIntArray() 
        else intArrayOf(-1)
    }
}