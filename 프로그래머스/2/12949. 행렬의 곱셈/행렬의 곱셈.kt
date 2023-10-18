class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val ar2 = Array<IntArray>(arr2[0].size){IntArray(arr2.size)}

        for(i in arr2[0].indices) { // 0~3
            var temp = intArrayOf()
            repeat(arr2.size) {
                temp += arr2[it][i]
            }
            ar2[i] = temp
        }

        fun mul(a: IntArray, b: IntArray) : Int
            = a.foldIndexed(0) {idx, acc, i -> acc + i*b[idx] }

        val answer = Array<IntArray>(arr1.size) {IntArray(arr2[0].size)}

        for(i in arr1.indices) {
            for(j in ar2.indices) {
                answer[i][j] = mul(arr1[i], ar2[j])
            }
        }

        return answer
    }
}