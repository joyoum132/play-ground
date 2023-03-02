import java.time.LocalDate


class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
    val tm: Map<String, String> = terms.associate { it.split(" ")[0] to it.split(" ")[1] }
    // 약관 이름 to 유효기간 n 개월

    var answer= mutableListOf<Int>()
    val ta = today.split(".")
    privacies.mapIndexed {  index, s ->
        val expirationDate = expirationDate(tm[s.split(" ")[1]]!!.toInt(), s.split(" ")[0])

        if(LocalDate.of(ta[0].toInt(),ta[1].toInt(), ta[2].toInt()).isAfter(
                LocalDate.of(expirationDate.first, expirationDate.second, expirationDate.third))
        ) {
            answer.add(index+1)
        }
    }

    return answer.toIntArray()
}

fun expirationDate(termsDuration: Int, agreeDate: String): Triple<Int, Int, Int> {
    val termsDurationToYmd: Pair<Int, Int> = Pair(termsDuration/12 , termsDuration%12)
    val agreeDateToYmd: Triple<Int, Int, Int> =
        Triple(
            agreeDate.split(".")[0].toInt(),
            agreeDate.split(".")[1].toInt(),
            agreeDate.split(".")[2].toInt()
        )

    val year = if(agreeDateToYmd.second + termsDurationToYmd.second > 12) agreeDateToYmd.first + termsDurationToYmd.first + 1 else agreeDateToYmd.first + termsDurationToYmd.first
    var month = if(agreeDateToYmd.second + termsDurationToYmd.second > 12) agreeDateToYmd.second + termsDurationToYmd.second - 12 else agreeDateToYmd.second + termsDurationToYmd.second
    val day = if(agreeDateToYmd.third == 1) 1 else agreeDateToYmd.third-1
    if(day == 1) month -1
    return Triple(year, month, day)
}
}