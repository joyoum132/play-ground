class Solution {
    fun solution(food: IntArray): String {
    fun addAll(range: Int, foodName: String): String{
        return (1..range).fold("") { acc, _ -> acc +foodName }
    }

    var answer = ""
    (1 until food.size).forEach {
        answer += addAll(food[it] / 2, it.toString())
        println("answer = ${answer}")
    }

    return answer + "0" + answer.reversed()
}
}