class Solution {
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean { 
        val visited = Array<Boolean>(rooms.size) { false }
        val stack: Stack<Int> = Stack()
        
        if(rooms[0].isEmpty()) {
            return false
        }
        else {
            for(r in rooms[0]) {
                stack.push(r)
            }
            visited[0] = true
        }

        while(stack.isNotEmpty()) {
            val k = stack.pop()
            if(!visited[k]) {
                println("visited key is $k")
                visited[k] = true
                for(rk in rooms[k]) {
                    stack.push(rk)
                }
            }
        }

        return visited.count { !it } == 0
    }
}