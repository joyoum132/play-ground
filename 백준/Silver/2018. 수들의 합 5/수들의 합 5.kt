import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var result = 1
    val n = nextInt()
    if(n < 3) {
        println(result)
        return
    }
    val last = n/2 + n%2
    var s = 1
    var e = 2
    var sum = s+e
    while(s <= e && s < last && e <= last) {
        if(sum < n) {
            e+=1
            sum += e
        } else if(sum > n) {
            sum -= s
            s += 1
        } else {
            result += 1
            e+=1
            sum += (e-s)
            s+=1
        }
    }
    println(result)
}