class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return (0 until arr1.size).map { x ->
            (0 until arr1[0].size).map {y ->
                val r = arr1[x][y] + arr2[x][y]
                r
            }.toIntArray()
        }.toTypedArray()
    }
}