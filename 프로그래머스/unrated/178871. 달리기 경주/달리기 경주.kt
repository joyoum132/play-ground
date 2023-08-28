class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val orders: MutableMap<String, Int> = players.mapIndexed { idx, s -> s to idx }.toMap().toMutableMap()

        callings.forEach {
            val order: Int = orders[it]!!
            val left = players[order - 1]

            orders[it] = order -1
            orders[left] = orders[left]!! +1

            players[order] = left
            players[order - 1] = it
        }
        return players
    }
}