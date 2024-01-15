import java.util.*;

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val input: String = next()

    val expression = input.split("-")
    var sum = expression[0].split("+").sumOf { it.toInt() }
    for(i in 1 until expression.size) {
        sum -= expression[i].split("+").sumOf { it.toInt() }
    }
    
    println(sum)
}