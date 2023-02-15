class Solution {
    fun solution(food: IntArray): String {
        fun addAll(range: Int, foodName: String): String {
            return (1..range).fold("") { acc, _ -> acc + foodName }
        }

        var answer = ""
        (1 until food.size).forEach {
            answer += addAll(food[it] / 2, it.toString())
            println("answer = ${answer}")
        }

        return answer + "0" + answer.reversed()
    }

    /*repeat 이라는 함수를 사용할수도 있다.

    repeat(몇번 반복?) { it -> 반복 작업할 내용. 이때 반복하는 순서가 it이다. }
    * */
    fun solution2(food: IntArray): String {
        var answer = ""
        // f 가 아닌 it 을 사용하게되면 repeat 에서는 자기 자신의 it 을 사용하게된다.
        (1 until food.size).forEach { f ->
            repeat(food[f] / 2) { answer += f}
        }

        return answer + "0" + answer.reversed()
    }
}
