import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()

    val tokens = StringTokenizer(br.readLine())
    val arr = IntArray(n){
        tokens.nextToken().toInt()
    }
    if(arr.size == 1) {
        println(0)
        return
    }

    Arrays.sort(arr)
    var result = 0
    var s = 0
    var e = n-1
    while(s < e) {
        val sum = arr[s]+arr[e]
        if(sum == m) {
            result += 1
            s+=1
            e-=1
        } else if(sum < m) {
            s+=1
        } else {
            e-=1
        }
    }
    println(result)
    bw.flush()
    bw.close()
}