class Solution {
    fun solution(x: Int): Boolean {
        return x % x.toString().fold(0) {acc , c -> acc + c.toString().toInt()} == 0
    }
}