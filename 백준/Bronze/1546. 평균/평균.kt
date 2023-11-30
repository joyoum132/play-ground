import java.util.*
import kotlin.math.max
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var max = 0
    var sum = 0
    val size = nextInt()
    repeat(size) {
        val i = nextInt()
        sum += i
        max = max(i, max)
    }
    println((sum*100.0/max)/size)
}