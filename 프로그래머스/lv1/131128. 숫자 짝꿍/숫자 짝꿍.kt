import kotlin.math.*

class Solution {
    fun solution(X: String, Y: String): String {
    val xm = mutableMapOf<Char, Int>()
    val ym = mutableMapOf<Char, Int>()
    for (x in X) {
        if(xm.containsKey(x)) {
            xm[x] = xm[x]!! +1
        } else {
            xm[x] = 1
        }
    }

    for (y in Y) {
        if(ym.containsKey(y)) {
            ym[y] = ym[y]!! +1
        } else {
            ym[y] = 1
        }
    }

    fun calc(main: MutableMap<Char, Int>, sub: MutableMap<Char, Int>)
        : MutableList<String> {
        val res = mutableListOf<String>()
            for (e in main) {
                if(sub.containsKey(e.key)) {
                    val min = min(e.value, sub[e.key]!!)
                    for(i in 0 until min) {
                        res.add(e.key.toString())
                    }
                }
            }
            return res
        }

    val a = if(xm.size >= ym.size) {
        calc(xm, ym)
    } else {
        calc(ym, xm)
    }

    return if(a.isEmpty())  "-1" 
        else if (a.count { it=="0" } == a.size) "0" 
        else { a.sortedDescending().joinToString("") }
    }
}