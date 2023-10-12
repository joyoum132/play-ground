class Solution {
    fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {
        val direction : Array<IntArray> = arrayOf(intArrayOf(0,1), intArrayOf(0,-1), intArrayOf(1,0), intArrayOf(-1,0))
        var step = -1

        val q : Queue<IntArray> = LinkedList()
        q.add(entrance)

        while(q.isNotEmpty()) {
            step += 1
            repeat(q.size) {
                val cur = q.poll()

                //미방문 노드에 대해서만 진행
                if(maze[cur[0]][cur[1]] != '+') {

                    //방문 여부를 변경해줌
                    maze[cur[0]][cur[1]] = '+'

                    //현재 위치에서 방문 가능한 노드를 체크해줌
                    repeat(4) {
                        if(cur[0]+direction[it][0] in 0 until maze.size && cur[1]+direction[it][1] in 0 until maze[0].size) {
                            val c = maze[cur[0]+direction[it][0]][cur[1]+direction[it][1]]
                            if(c == '.') {
                                q.add(intArrayOf(cur[0]+direction[it][0], cur[1]+direction[it][1]))
                            }
                        }
                    }

                    val isBoarder = cur[0] == 0 || cur[1] == 0 || cur[0] == maze.size-1 || cur[1] == maze[0].size-1
                    val isEntrance = cur[0] == entrance[0] && cur[1] == entrance[1]

                    /*
                    현재 위치가 입구면 continue
                    입구가 아니면서 boarder 면 step 을 리턴 (가장 먼저 나온경우가 가장 짧은 경로이기 때문)
                    입구도 아니고, boarder 도 아니라면 경로에 +1
                    */
                    if(isBoarder && !isEntrance) {
                        return step
                    }
                }
            }
        }
        return -1
    }
}