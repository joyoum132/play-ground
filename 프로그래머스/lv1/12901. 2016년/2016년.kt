class Solution {
    fun solution(a: Int, b: Int): String {
        val daw = arrayOf("THU", "FRI", "SAT", "SUN", "MON", "TUE","WED")
        fun getDays(x: Int) : Int
        = when(x) {
            2 -> 29
            4, 6, 9, 11 -> 30
            else -> 31
        }
        val total = (1 until a).fold(0) {acc, i -> acc + getDays(i)}.plus(b)
        return daw[total%7]
    }
}