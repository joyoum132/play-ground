class Solution {
    fun solution(s: String): String {
        val arr = s.split(" ")
            .map{
                it.toInt()
            }.sorted()
        return "${arr[0]} ${arr[arr.size-1]}"
    }
}