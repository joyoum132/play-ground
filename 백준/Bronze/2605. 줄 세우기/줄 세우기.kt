import java.util.*
fun main(args: Array<String>) = with(Scanner(System.`in`)) {

    val size = nextInt()
    val student = IntArray(size) //(0, 1, 1, 3, 2)
    for (i in 0 until size) {
        student[i] = nextInt()
    }
    
    val res = LinkedList<Int>()
    res.add(1)

    for(i in 1 until size) {
        val num = student[i]
        if(num == 0) res.add(i+1)
        else res.add(i-num, i+1)
    }

    res.forEach { print("$it ") }
}